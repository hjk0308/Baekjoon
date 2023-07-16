package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem28074 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();
		
		// 주어진 문자열에 포함된 알파벳 대문자를 이용해 MOBIS를 만들 수 있는지 결과를 출력하는 단계
		if(s.contains("M") && s.contains("O") && s.contains("B") &&
		   s.contains("I") && s.contains("S"))
			bw.write("YES");
		else
			bw.write("NO");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}