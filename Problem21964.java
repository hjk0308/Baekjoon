package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem21964 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 문자열의 길이
		String S = br.readLine();  // 문자열
		
		// 마지막 5글자를 출력하는 단계
		bw.write(S.substring(N-5, N));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}