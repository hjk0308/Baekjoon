package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25706 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] height = new int[N+1];  // height[0]은 사용 X
		int[] DP = new int[N+1];  // DP[0]은 사용 X, 각 칸에서부터 총 밟는 칸의 개수 DP 테이블
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++)
		{
			height[i] = Integer.parseInt(st.nextToken());
		}
		
		// 각 칸에서부터 자전거를 타고 달렸을 때에 총 밟는 칸의 개수를 구하는 단계
		// DP 테이블을 채움
		DP[N] = 1;
		for(int i = N-1; i >= 1; i--)
		{
			if(height[i] == 0)  // 칸의 점프대의 높이가 0인 경우
			{
				DP[i] = DP[i+1] + 1;
			}
			else if(i+1+height[i] > N)  // 칸의 점프대의 점프할 경우 도로를 넘어가는 경우
			{
				DP[i] = 1;
			}
			else  // 그 이외의 나머지 경우
			{
				DP[i] = DP[i+1+height[i]] + 1;
			}
		}
		
		// 출력하는 단계
		for(int i = 1; i <= N; i++)
		{
			bw.write(String.valueOf(DP[i]) + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}