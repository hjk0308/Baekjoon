package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15000 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();
		
		// 대문자로 바꾸어 출력하는 단계
		bw.write(s.toUpperCase());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}