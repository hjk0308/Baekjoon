package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem27433 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 정수 N
		long fact = 1;  // 팩토리얼 값
		
		// N!(팩토리얼)의 값을 구하는 단계
		for(int i = 2; i <= N; i++)
		{
			fact *= i; 
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(fact));

		bw.flush();
		
		br.close();
		bw.close();
	}
}