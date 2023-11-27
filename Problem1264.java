package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1264 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하는 단계
		String s = null;  // 각 테스트 케이스의 입력받은 문장
		char ch;
		int len;  // 각 테스트 케이스의 문장의 길이
		int count;  // 각 테스트 케이스의 모음의 개수
		
		// 각 테스트 케이스마다 모음의 개수를 세서 출력하는 단계
		s = br.readLine();
		while(!s.equals("#"))
		{
			count = 0;
			len = s.length();
			
			for(int i = 0; i < len; i++)
			{
				ch = s.charAt(i);
				
				if((ch == 'a') || (ch == 'A'))
					count += 1;
				else if((ch == 'e') || (ch == 'E'))
					count += 1;
				else if((ch == 'i') || (ch == 'I'))
					count += 1;
				else if((ch == 'o') || (ch == 'O'))
					count += 1;
				else if((ch == 'u') || (ch == 'U'))
					count += 1;		
			}
			
			bw.write(String.valueOf(count) + "\n");
			
			s = br.readLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}