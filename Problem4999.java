package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4999 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s1 = br.readLine();  // 재환이가 가장 길게 낼 수 있는 아
		String s2 = br.readLine();  // 의사가 듣기를 원하는 아
		
		// 문제의 조건에 맞게 출력하는 단계
		if(s1.length() < s2.length())
			bw.write("no");
		else
			bw.write("go");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}