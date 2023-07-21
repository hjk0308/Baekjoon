package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2744 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();  // 입력받은 문자열
		int i;  // 문자를 아스키 코드 번호로 저장하기 위한 변수
		char c;  // 문자로 저장하기 위한 변수
		
		// 대문자는 소문자로, 소문자는 대문자로 바꿔서 출력하는 단계
		for(int k = 0; k < s.length(); k++)
		{
			c = s.charAt(k);
			i = c;
			
			if((i >= 65) && (i <= 96))
				bw.write(String.valueOf(c).toLowerCase());
			else
				bw.write(String.valueOf(c).toUpperCase());
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}