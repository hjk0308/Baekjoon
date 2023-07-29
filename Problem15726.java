package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15726 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		int max;  // 나올 수 있는 가장 큰 값
		
		// 나올 수 있는 가장 큰 값을 구하는 단계
		max = (int) Math.max(A * B / C, A / B * C);
		
		// 출력하는 단계
		bw.write(String.valueOf(max));

		bw.flush();
		
		br.close();
		bw.close();
	}
}