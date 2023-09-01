package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5524 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = null;
		int N = Integer.parseInt(br.readLine());
		
		// 이름을 입력받아서 소문자로 바꾸어 출력하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			s = s.toLowerCase();
			
			bw.write(s + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}