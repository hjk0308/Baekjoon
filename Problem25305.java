package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem25305 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 응시자 수 
		int k = Integer.parseInt(st.nextToken());  // 상을 받는 사람 수
		int[] score = new int[N];  // 학생들의 점수를 저장하기 위한 배열
		int cutline = -1;  // 커트라인 점수
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		// 상을 받는 커트라인 점수를 구하는 단계
		Arrays.sort(score);
		
		cutline = score[N-k];
		
		// 출력하는 단계
		bw.write(String.valueOf(cutline));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}