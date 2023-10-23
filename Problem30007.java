package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem30007 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 라면을 끓이는 횟수
		int A;  // 라면을 끓일 때의 라면 계수
		int B;  // 기본 물의 양
		int X;  // 끓일 라면 수
		int W;  // 라면 공식에 따라 필요한 물의 양, 라면 공식 W = A(X-1) + B
		
		// i번째로 라면을 끓일 때 라면 공식에 따라 필요한 물의 양 W를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			X = Integer.parseInt(st.nextToken());
			
			W = A * (X - 1) + B;
			
			bw.write(W + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}