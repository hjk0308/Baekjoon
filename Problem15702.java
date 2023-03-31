package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15702 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 문제의 개수 N
		int M = Integer.parseInt(st.nextToken());  // 응시자 수 M
		int[] scores = new int[N];  // 각 문제들의 배점
		int[] nums = new int[M];  // 각 학생들의 수험 번호
		int[] grades = new int[M];  // 각 학생들의 점수
		int idx = -1;  // 가장 높은 점수의 학생의 인덱스
		int max = -1;  // 가장 높은 점수
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			scores[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 학생들의 점수를 채점하는 단계
		for(int i = 0; i < M; i++)
		{
			st = new StringTokenizer(br.readLine());
			nums[i] = Integer.parseInt(st.nextToken()); 
			
			for(int j = 0; j < N; j++)
			{
				if(st.nextToken().equals("O"))
				{
					grades[i] += scores[j];
				}
			}
		}
		
		// 가장 높은 점수를 얻은 학생의 번호와 점수를 찾는 단계(여러 명이면 가장 작은 수험 번호 찾음)
		idx = M-1;
		max = grades[M-1];
		
		for(int i = M-2; i > -1; i--)
		{
			if(max < grades[i])  
			{
				max = grades[i];
				idx = i;
			}
			else if(max == grades[i])  // 점수가 같은 경우
			{
				if(nums[idx] > nums[i])  // 더 작은 수험 번호
					idx = i;
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(nums[idx]) + " " + String.valueOf(grades[idx]));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}