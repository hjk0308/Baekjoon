package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2475 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		long sum = 0;  // 5개의 숫자를 각각 제곱한 수의 합

		// 5개의 숫자를 각각 제곱한 수의 합을 구하는 단계
		for(int i = 1; i <= 5; i++)
		{
			sum += Math.pow(Long.parseLong(st.nextToken()), 2);
		}
		
		// 각각 제곱한 수의 합을 10으로 나눈 나머지인 검증수를 출력하는 단계
		bw.write(String.valueOf(sum % 10));

		bw.flush();
		
		br.close();
		bw.close();
	}
}