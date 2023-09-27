package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem23825 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // S 모양의 블록의 개수
		int M = Integer.parseInt(st.nextToken());  // A 모양의 블록의 개수
		int max;  // SASA 모형 개수의 최댓값
		
		// SASA 모형 개수의 최댓값을 구하는 단계
		N = N / 2;
		M = M / 2;
		
		max = Math.min(N, M);
		
		// 출력하는 단계 
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}