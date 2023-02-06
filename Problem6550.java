package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem6550 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		String s, t;
		String input;
		int idx = -1;
		
		// 입력 및 s가 t의 부분 문자열인지 판단하는 단계
		input = br.readLine();
		while(input != null)
		{
			st = new StringTokenizer(input);
			
			idx = 0;
			s = st.nextToken();
			t = st.nextToken();
			
			for(int i = 0; i < t.length(); i++)
			{
				if(s.charAt(idx) == t.charAt(i))
					idx += 1;
				
				if(idx > s.length()-1)
					break;
			}
			
			if(idx > s.length()-1)
			{
				bw.write("Yes");
				bw.newLine();
			}
			else
			{
				bw.write("No");
				bw.newLine();
			}
			
			input = br.readLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}