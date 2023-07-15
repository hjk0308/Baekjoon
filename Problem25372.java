package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem25372 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 문자열의 개수
		String s = null;  // 비밀번호
		int len;  // 비밀번호 길이
		
		// 사용할 수 있는 비밀번호인지 확인하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			len = s.length();
			
			if((len >= 6) && (len <= 9))
				bw.write("yes");
			else
				bw.write("no");
			
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}