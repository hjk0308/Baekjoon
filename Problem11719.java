package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11719 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String S = null;  // 문자열 S
		
		// 입력받은 대로 출력하는 단계
		while((S = br.readLine()) != null)
		{
			bw.write(S);
			bw.newLine();
		}
		
		// 전체 출력하는 단계	
		bw.flush();
		
		br.close();
		bw.close();
	}
}