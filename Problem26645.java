package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem26645 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		
		// 선택해야 할 성장의 비약을 구하는 단계
		if(N <= 205)
			bw.write("1");
		else if(N <= 217)
			bw.write("2");
		else if(N <= 228)
			bw.write("3");
		else  // N >= 229 
			bw.write("4");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}