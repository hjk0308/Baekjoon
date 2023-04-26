package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10824 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		long AB = Long.parseLong(st.nextToken() + st.nextToken());  // A와 B를 붙인 수
		long CD = Long.parseLong(st.nextToken() + st.nextToken());  // C와 D를 붙인 수
		
		// A와 B를 붙인 수와 C와 D를 붙인 수의 합을 구하는 단계
		long res = AB + CD;  // A와 B를 붙인 수와 C와 D를 붙인 수의 합
		
		// 출력하는 단계	
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}