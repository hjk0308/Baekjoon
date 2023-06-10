package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15439 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  
		int res = 0;

		// 상의와 하의가 서로 다른 색상인 조합의 가짓수를 구하는 단계
		res = N * (N-1);
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}