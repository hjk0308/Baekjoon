package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem30045 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 홍보 글의 문장 수
		int count = 0;  // 홍보 글에 영일이 이모티콘을 넣은 횟수
		String s = null;
		
		// 홍보 글에 영일이 이모티콘을 넣은 횟수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			
			if(s.contains("01") || s.contains("OI"))
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}