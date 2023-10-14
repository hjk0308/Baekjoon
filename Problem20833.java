package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem20833 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine()); 
		int result = 0;  // 1부터 N까지의 자연수의 세제곱의 합
		
		// 결과적으로 문제에서 구하고자 하는 자연수의 세제곱의 합을 구하는 단계
		result = ((N * (N + 1)) / 2) * ((N * (N + 1)) / 2);
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}