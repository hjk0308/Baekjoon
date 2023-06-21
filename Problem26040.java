package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26040 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String A = br.readLine();  // 문자열
		StringTokenizer B = new StringTokenizer(br.readLine());  // 문자 목록
		String T = null;
		
		// 문자 목록 B에 따라 문자열 A에서 대문자를 소문자로 치환하는 단계
		while(B.hasMoreTokens())
		{
			T = B.nextToken();
			A = A.replaceAll(T, T.toLowerCase());
		}
		
		// 출력하는 단계
		bw.write(A);
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}