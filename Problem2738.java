package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2738 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 행렬의 행 크기
		int M = Integer.parseInt(st.nextToken());  // 행렬의 열 크기
		int[][] matrix = new int[N][M];  // N*M 크기의 행렬
		
		// 행렬 A를 배열에 저장하는 단계
		for(int i = 0; i < N; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < M; j++)
			{
				matrix[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 행렬 A가 저장된 배열에 행렬 B를 더해서 다시 저장하는 단계
		for(int i = 0; i < N; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < M; j++)
			{
				matrix[i][j] += Integer.parseInt(st.nextToken());
			}
		}
		
		// 출력하는 단계
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < M; j++)
			{
				bw.write(String.valueOf(matrix[i][j] + " "));
			}
			
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}