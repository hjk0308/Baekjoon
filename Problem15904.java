package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15904 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] UCPC = {'U', 'C', 'P', 'C'};
		int idx = 0;
		
		// 입력받는 단계
		String s = br.readLine();
		
		// 문자열을 UCPC로 축약할 수 있는지 확인하는 단계
		for(int i = 0; i < s.length(); i++)
		{
			if(UCPC[idx] == s.charAt(i))
			{
				idx += 1;
				
				if(idx > 3)
					break;
			}
		}
		
		// 출력하는 단계
		if(idx > 3)
			bw.write("I love UCPC");
		else
			bw.write("I hate UCPC");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}