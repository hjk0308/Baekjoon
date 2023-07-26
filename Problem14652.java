package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14652 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 관중석의 세로 길이
		int M = Integer.parseInt(st.nextToken());  // 관중석의 가로 길이
		int K = Integer.parseInt(st.nextToken());  // 관중석 번호
		int n, m;  // 잃어버린 자리의 좌표 (n, m)

		// 잃어버린 자리의 좌표를 구하는 단계
		n = K / M;
		m = K % M;
		
		// 출력하는 단계
		bw.write(n + " " + m);

		bw.flush();
		
		br.close();
		bw.close();
	}
}