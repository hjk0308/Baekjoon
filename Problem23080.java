package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem23080 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int K = Integer.parseInt(br.readLine());  // 막대의 굵기 K
		String S = br.readLine();  // 문자열 S
		int len = S.length();  // 문자열 S의 길이
		String result = "";  // 해독한 결과
		int idx = 0;  // 인덱스 
		
		// 암호문을 해독하는 단계
		while(len > idx)
		{
			result += String.valueOf(S.charAt(idx));
			idx += K;
		}
		
		// 출력하는 단계
		bw.write(result);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}