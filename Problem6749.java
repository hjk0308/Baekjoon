package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6749 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int Y = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int O = M + (M-Y);  // the age of the oldest child
		
		// 출력하는 단계
		bw.write(String.valueOf(O));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}