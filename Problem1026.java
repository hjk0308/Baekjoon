package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem1026 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int S = 0;
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		int[] B = new int[N];
		
		// 배열 A를 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
		{
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 B를 입력받는 단계
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
		{
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 A와 B를 오름차순으로 정렬하는 단계
		Arrays.sort(A);
		Arrays.sort(B);
		
		// S의 최솟값을 계산하는 단계
		for(int i = 0; i < N; i++)
		{
			S += A[i]*B[N-1-i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(S));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}