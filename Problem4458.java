package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4458 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 줄의 수 N
		String s = null;  // 문자열
		
		// 각 줄의 첫글자를 대문자로 바꾸어 출력하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			s = s.replaceFirst(s.substring(0, 1), s.substring(0, 1).toUpperCase());
			bw.write(s + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}