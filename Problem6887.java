package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6887 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());  
		int length = 0;  // the maximum side length
		
		// the maximum side length를 구하는 단계
		length = (int) Math.floor(Math.sqrt(n));
		
		// 출력하는 단계
		bw.write("The largest square has side length " + length + ".");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}