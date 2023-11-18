package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem26560 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());  // 문장의 수
		String s = null;
		
		// 문장들을 입력받아서 마침표가 없으면 찍는 단계
		for(int i = 1; i <= n; i++)
		{
			s = br.readLine();
			bw.write(s);
			
			if(s.charAt(s.length()-1) != '.')
				bw.write(".");
			
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}