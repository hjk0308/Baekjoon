package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem3058 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스 T
		int sum = -1;  // 짝수의 합
		int min = -1;  // 짝수의 최솟값
		int n = -1;
		
		// 7개의 자연수들 중 짝수의 합과 최솟값을 구하는 단계
		for(int i = 0; i < T; i++)
		{
			sum = 0;
			min = 101;
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 7; j++)
			{
				n = Integer.parseInt(st.nextToken());
				
				if((n % 2) == 0)
				{
					sum += n;
					
					if(min > n)
						min = n;
				}
			}
			
			bw.write(String.valueOf(sum) + " " + String.valueOf(min) + "\n");
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}
