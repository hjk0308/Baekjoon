package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9653 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = "    8888888888  888    88888\n"
				+ "   88     88   88 88   88  88\n"
				+ "    8888  88  88   88  88888\n"
				+ "       88 88 888888888 88   88\n"
				+ "88888888  88 88     88 88    888888\n"
				+ "\n"
				+ "88  88  88   888    88888    888888\n"
				+ "88  88  88  88 88   88  88  88\n"
				+ "88 8888 88 88   88  88888    8888\n"
				+ " 888  888 888888888 88  88      88\n"
				+ "  88  88  88     88 88   88888888";
		
		// 출력하는 단계
		bw.write(s);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}