package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem3046 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R1 = Integer.parseInt(st.nextToken());
		int R2 = -1;
		int S = Integer.parseInt(st.nextToken());  // R1과 R2의 평균
		
		// R2를 구하는 단계
		R2 = S*2-R1;
		
		// 출력하는 단계
		bw.write(String.valueOf(R2));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}