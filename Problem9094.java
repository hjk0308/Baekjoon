package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem9094 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스의 수
		int count = 0;  // 각 테스트 케이스마다 문제의 조건을 만족하는 (a, b)쌍의 개수
		int n, m;  // 각 테스트 케이스의 두 정수 n, m
		double temp;  // 임시 저장 변수
		StringTokenizer st = null;
		
		// 각 테스트 케이스마다 문제의 조건을 만족하는 (a, b)쌍의 개수를 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			count = 0;
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			for(int b = 1; b < n; b++)
			{
				for(int a = 1; a < b; a++)
				{
					temp = (double)(a*a + b*b + m) / (double)(a*b);
					
					if(temp % 1 == 0.0)
						count += 1;		
				}
			}
			
			bw.write(String.valueOf(count) + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}