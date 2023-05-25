package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem13235 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String word = br.readLine();
		StringBuffer sb = new StringBuffer(word);
		String reverse = sb.reverse().toString();
		
		// 입력으로 주어진 단어가 팰린드롬인지 확인하고 출력하는 단계
		if(word.equals(reverse))
			bw.write("true");
		else
			bw.write("false");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}