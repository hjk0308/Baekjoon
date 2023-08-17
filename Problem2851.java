package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2851 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] point = new int[10];  // 버섯의 점수를 저장할 배열
		int sum = 0;  // 마리오가 받는 점수
		
		for(int i = 0; i < 10; i++)
		{
			point[i] = Integer.parseInt(br.readLine());
		}
		
		// 최대한 100에 가깝게 마리오가 받는 점수를 구하는 단계(가까운 수가 2개면 큰 값이 점수)
		sum += point[0];
		for(int i = 1; i < 10; i++)
		{
			if(Math.abs(100-sum) < Math.abs(100-(sum+point[i])))
				break;
			else if(Math.abs(100-sum) > Math.abs(100-(sum+point[i])))
				sum += point[i];
			else  // Math.abs(100-sum) == Math.abs(100-(sum+point[i]))
			{
				sum += point[i];
				break;
			}		
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}