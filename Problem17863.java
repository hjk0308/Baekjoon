package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem17863 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();
		
		// 출력하는 단계
		if(s.substring(0, 3).equals("555"))
			bw.write("YES");
		else
			bw.write("NO");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}