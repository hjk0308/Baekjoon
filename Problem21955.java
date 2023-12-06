package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem21955 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		String N = br.readLine();
		int len = N.length();
		
		// 문제에서 주어진 조건에 맞게 출력하는 단계
		bw.write(N.substring(0, len/2) + " " + N.substring(len/2, len));
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}