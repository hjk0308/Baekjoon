package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10987 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int count = 0;  // 모음의 개수를 저장하는 변수
		String s = br.readLine();  // 입력받은 단어
		char c = ' ';
		
		// 모음의 개수를 세는 단계
		for(int i = 0; i < s.length(); i++)
		{
			c = s.charAt(i);
			
			if((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u'))
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}