package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10170 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 예제대로 출력하는 단계
		String s = "NFC West       W   L  T\n"
				+ "-----------------------\n"
				+ "Seattle        13  3  0\n"
				+ "San Francisco  12  4  0\n"
				+ "Arizona        10  6  0\n"
				+ "St. Louis      7   9  0\n"
				+ "\n"
				+ "NFC North      W   L  T\n"
				+ "-----------------------\n"
				+ "Green Bay      8   7  1\n"
				+ "Chicago        8   8  0\n"
				+ "Detroit        7   9  0\n"
				+ "Minnesota      5  10  1";
		
		bw.write(s);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}