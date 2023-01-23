package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2810 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int c = 0;
		int res = -1;
		
		String s = br.readLine();
		
		// 최대 사람의 수를 구하는 단계
		s = s.replaceAll("S", "*S*");
		s = s.replaceAll("LL", "*LL*");
		s = s.replaceAll("[*][*]", "*");
		
		for(int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '*')
				c += 1;
		}
		
		if(n <= c)
			res = n;
		else  // n > c
			res = c;
			
		// 출력하는 단계
		bw.write(String.valueOf(res));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}