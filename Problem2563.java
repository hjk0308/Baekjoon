package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2563 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());  // 색종이의 개수
		int d1, d2;  // 변 사이의 거리
		int area = 0;  // 색종이가 붙은 검은 영역의 넓이
		int[][] paper = new int[101][101];  // 도화지
		StringTokenizer st = null;
		
		// 색종이가 붙은 검은 영역의 넓이를 구하는 단계
		for(int i = 1; i <= n; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			// 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리
			d1 = Integer.parseInt(st.nextToken());  
			// 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리
			d2 = Integer.parseInt(st.nextToken());
			
			for(int j = d1+1; j <= d1+10; j++)
			{
				for(int k = d2+1; k <= d2+10; k++)
				{
					paper[j][k] += 1;
				}
			}
		}
		
		for(int i = 0; i <= 100; i++)
		{
			for(int j = 0; j <= 100; j++)
			{
				if(paper[i][j] > 0)
					area += 1;
			}
		}
		
		// 색종이가 붙은 검은 영역의 넓이를 출력하는 단계
		bw.write(String.valueOf(area));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}