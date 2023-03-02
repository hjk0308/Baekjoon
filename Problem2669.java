package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2669 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int[][] nums = new int[100][100];  // 100 * 100 좌표평면
		int res = 0;
		int x1, x2, y1, y2; 
		StringTokenizer st;
		
		// 입력을 받고 네 개의 직사각형이 차지하는 면적을 구하는 단계
		for(int i = 0; i < 4; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			x1 = Integer.parseInt(st.nextToken());  // 사각형의 왼쪽 아래 꼭짓점의 x 좌표
			y1 = Integer.parseInt(st.nextToken());  // 사각형의 왼쪽 아래 꼭짓점의 y 좌표
			x2 = Integer.parseInt(st.nextToken());  // 사각형의 오른쪽 위 꼭짓점의 x 좌표
			y2 = Integer.parseInt(st.nextToken());  // 사각형의 오른쪽 위 꼭짓점의 y 좌표
			 
			for(int j = y1+1; j <= y2; j++)
			{
				for(int k = x1+1; k <= x2; k++)
				{
					nums[k-1][j-1] += 1;
				}
			}
		}
		
		for(int i = 0; i < 100; i++)
		{
			for(int j = 0; j < 100; j++)
			{
				if(nums[i][j] > 0)
					res += 1;
			}
		}
	
		// 출력하는 단계
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}