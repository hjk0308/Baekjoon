package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2393 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 예제대로 출력하는 단계
		String s = "  ___  ___  ___\n"
				+ "  | |__| |__| |\n"
				+ "  |           |\n"
				+ "   \\_________/\n"
				+ "    \\_______/\n"
				+ "     |     |\n"
				+ "     |     |\n"
				+ "     |     |\n"
				+ "     |     |\n"
				+ "     |_____|\n"
				+ "  __/       \\__\n"
				+ " /             \\\n"
				+ "/_______________\\";
		
		bw.write(s);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}