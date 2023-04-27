package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11721 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();
		
		// 한 줄에 열 글자씩 끊어서 출력하는 단계
		for(int i = 0; i < s.length(); i++)
		{
			bw.write(String.valueOf(s.charAt(i)));
			
			if(((i+1) % 10) == 0)
				bw.newLine();
		}
		
		// 전체 출력하는 단계	
		bw.flush();
		
		br.close();
		bw.close();
	}
}