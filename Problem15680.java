package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15680 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		
		// 입력에 따라 출력하는 단계
		if(N == 0)
			bw.write("YONSEI");
		else if(N == 1)
			bw.write("Leading the Way to the Future");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}