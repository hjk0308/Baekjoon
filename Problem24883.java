package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem24883 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();
		
		// 주어진 알파벳이 N 아니면 n인지 확인하는 단계
		if(s.equals("N") || s.equals("n"))
			bw.write("Naver D2");
		else
			bw.write("Naver Whale");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}