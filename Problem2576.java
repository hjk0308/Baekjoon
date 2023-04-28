package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2576 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = -1;
		int min = 100;  // 홀수들의 최솟값
		int sum = 0;  // 홀수들의 합
		
		// 홀수들의 합과 홀수들 중 최솟값을 구하는 단계
		for(int i = 1; i <= 7; i++)
		{	
			n = Integer.parseInt(br.readLine());
			
			if((n % 2) == 1)
			{
				sum += n;
				
				if(n < min)
					min = n;
			}
		}
		
		// 출력하는 단계
		if(min != 100)
		{
			bw.write(String.valueOf(sum));
			bw.newLine();
			bw.write(String.valueOf(min));
		}
		else
			bw.write("-1");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}