package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9086 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스의 수
		String s = null;  // 문자열
		
		// 각 테스트 케이스마다 문자열의 첫 글자와 마지막 글자를 연속하여 출력하는 단계
		for(int i = 1; i <= T; i++)
		{
			s = br.readLine();
			bw.write(String.valueOf(s.charAt(0)) + 
					 String.valueOf(s.charAt(s.length()-1)));
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}