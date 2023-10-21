package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem30328 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());
		int fees = 0;
		
		// the total amount of registration fees를 구하는 단계
		fees = 4000 * n;
		
		// 출력하는 단계
		bw.write(String.valueOf(fees));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}