package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2167 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 배열의 행의 크기
		int M = Integer.parseInt(st.nextToken());  // 배열의 열의 크기
		int[][] sums = new int[N][M];
		
		int i = -1;
		int j = -1;
		int x = -1;
		int y = -1;
		
		int K = -1;  // 합을 구할 부분의 개수
		int sum = -1;
		
		// 배열의 값들의 누적합을 구하는 단계
		for(int a = 0; a < N; a++)
		{
			st = new StringTokenizer(br.readLine());
			
			sums[a][0] = Integer.parseInt(st.nextToken());
			for(int b = 1; b < M; b++)
			{
				sums[a][b] = sums[a][b-1] + Integer.parseInt(st.nextToken());
			}
		}
		
		// (i, j) 위치부터 (x, y) 위치까지에 저장되어 있는 수들의 합을 구하는 단계
		K = Integer.parseInt(br.readLine());
		
		for(int a = 0; a < K; a++)
		{
			st = new StringTokenizer(br.readLine());
			
			i = Integer.parseInt(st.nextToken())-1;  // 입력받은 i 값을 인덱스로 변경
			j = Integer.parseInt(st.nextToken())-1;  // 입력받은 j 값을 인덱스로 변경
			x = Integer.parseInt(st.nextToken())-1;  // 입력받은 x 값을 인덱스로 변경
			y = Integer.parseInt(st.nextToken())-1;  // 입력받은 y 값을 인덱스로 변경
			
			sum = 0;
			
			if(j == 0)  // j가 0인 경우, 즉 입력받은 j 값이 1인 경우
			{
				for(int b = i; b <= x; b++)
				{
					sum += sums[b][y];
				}
			}
			else  // j가 0이 아닌 경우, 즉 입력받은 j 값이 2 이상인 경우
			{
				for(int b = i; b <= x; b++)
				{
					sum += sums[b][y]-sums[b][j-1];
				}
			}
			
			bw.write(String.valueOf(sum));
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}