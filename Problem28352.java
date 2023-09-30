package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem28352 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		int weeks = 6;  // N!초의 주
		
		// N!초가 몇 주와 동일한지 구하는 단계
		if(N > 10)
		{
			for(int i = 11; i <= N; i++)
			{
				weeks *= i;
			}
		}
		
		// 출력하는 단계 
		bw.write(String.valueOf(weeks));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}