package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Problem5800 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int K = Integer.parseInt(br.readLine());  // 반의 개수 K
		int N = -1;  // 학생 수 N
		int max = -1;  // 최대 점수
		int min = -1;  // 최소 점수
		int lg = -1;  // 가장 큰 인접한 점수 차이
		Integer[] grades = null;  // 학생들의 점수를 저장할 배열
		StringTokenizer st = null;
		
		for(int i = 1; i <= K; i++)
		{
			max = -1;  // 최대 점수 초기화
			min = 101;  // 최소 점수 초기화
			lg = -1;  // 가장 큰 인접한 점수 차이 초기화
			
			// 입력받는 단계
			st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			grades = new Integer[N];
			
			for(int j = 0; j < N; j++)
			{
				grades[j] = Integer.parseInt(st.nextToken());
			}
			
			// 내림차순 정렬 
			Arrays.sort(grades, Collections.reverseOrder());
			
			// 최대 점수, 최소 점수, 가장 큰 인접한 점수 차이 구하는 단계
			max = grades[0];  // 최대 점수 구함
			min = grades[grades.length-1];  // 최소 점수 구함
			
			// 가장 큰 인접한 차이 구함
			for(int j = 0; j < N-1; j++)
			{
				if(lg < grades[j]-grades[j+1])
					lg = grades[j]-grades[j+1];
			}
			
			// 출력하는 단계
			bw.write("Class " + String.valueOf(i));
			bw.newLine();
			bw.write("Max " + String.valueOf(max) + ", Min " + 
			String.valueOf(min) + ", Largest gap " + String.valueOf(lg));
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}