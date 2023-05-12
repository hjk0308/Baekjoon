package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem9085 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int sum;  // 자연수의 합
		int N = -1;  // 자연수의 개수
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		// 각 테스트 케이스마다 주어진 자연수의 합을 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			sum = 0;
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int j = 1; j <= N; j++)
			{
				sum += Integer.parseInt(st.nextToken());
			}
			
			bw.write(String.valueOf(sum));
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}