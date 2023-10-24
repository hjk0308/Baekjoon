package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem30018 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 대여소의 개수
		StringTokenizer st = null;
		int[] A = new int[N];  // 서비스 시작 전 각 대여소의 자전거 개수
		int[] B = new int[N];  // 서비스 중단 후 각 대여소의 자전거 개수
		int min = 0;  // 자전거를 최소 옮기는 횟수
		
		// 서비스 시작 전 각 대여소의 자전거 개수를 저장
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 서비스 중단 후 각 대여소의 자전거 개수를 저장
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			B[i] = Integer.parseInt(st.nextToken());
		}
		
		// 자전거를 최소 옮기는 횟수를 구하는 단계
		for(int i = 0; i < N; i++)
		{
			if(B[i] > A[i])
				min += (B[i] - A[i]);
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(min));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}