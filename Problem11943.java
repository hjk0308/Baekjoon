package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11943 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());  // 첫 번째 바구니의 사과의 수
		int B = Integer.parseInt(st.nextToken());  // 첫 번째 바구니의 오렌지의 수
		
		st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());  // 두 번째 바구니의 사과의 수
		int D = Integer.parseInt(st.nextToken());  // 두 번째 바구니의 오렌지의 수
		
		int min = 0;  // 사과와 오렌지를 옮기는 최소 횟수
		
		// 문제에서 주어진 조건을 만족하면서 사과와 오렌지를 옮기는 최소 횟수를 구하는 단계
		if(A+D >= B+C)
			min = B+C;
		else  // A+D < B+C
			min = A+D;
		
		// 출력하는 단계
		bw.write(String.valueOf(min));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}