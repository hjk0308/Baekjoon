package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem26531 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();
		int a = Integer.parseInt(s.substring(0, 1));
		int b = Integer.parseInt(s.substring(4, 5));
		int c = Integer.parseInt(s.substring(8, 9));
		
		// a + b = c가 옳은 식인지 확인하는 단계
		if((a + b) == c)
			bw.write("YES");
		else
			bw.write("NO");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}