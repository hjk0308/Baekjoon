package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;

public class Problem2670 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 실수의 개수 N
		BigDecimal[] nums = new BigDecimal[N]; 
		BigDecimal[] maxMul = new BigDecimal[N];  // 0부터 인덱스 구간까지의 연속된 수들의 곱의 최댓값
		BigDecimal max = new BigDecimal("-1.0");  // N개의 실수에서 한 개 이상의 연속된 수들의 곱의 최댓값
		BigDecimal temp = new BigDecimal("-1.0");  // temp
		
		for(int i = 0; i < N; i++)
		{
			nums[i] = new BigDecimal(br.readLine());
		}
		
		// N개의 실수에서 한 개 이상의 연속된 수들의 곱의 최대를 찾는 단계
		maxMul[0] = nums[0];
		max = maxMul[0];
		for(int i = 1; i < N; i++)
		{
			temp = maxMul[i-1].multiply(nums[i]);
			
			if(temp.compareTo(nums[i]) == 1)
				maxMul[i] = temp;
			else
				maxMul[i] = nums[i];
			
			if(maxMul[i].compareTo(max) == 1)
				max = maxMul[i];
		}
		
		// 출력하는 단계
		bw.write(String.format("%.3f", max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}