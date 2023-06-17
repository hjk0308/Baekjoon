package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11365 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받아서 뒤집는 단계
		String s = null;
		StringBuffer sb = null;
		
		s = br.readLine();
		while(!(s.equals("END")))
		{
			sb = new StringBuffer(s);
			bw.write(sb.reverse().toString());
			bw.newLine();
		
			s = br.readLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}