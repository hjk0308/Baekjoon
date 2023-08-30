package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem16394 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		int result = N-1946;  // 홍익대학교의 개교 주년
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}