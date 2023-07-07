package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem27866 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String S = br.readLine();  // 단어 S
		int i = Integer.parseInt(br.readLine());  // 정수 i
		
		// S의 i번째 글자를 출력하는 단계
		bw.write(String.valueOf(S.charAt(i-1)));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}