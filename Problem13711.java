package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem13711 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());	
		int[] x = new int[N];
		int[] y = new int[N];
		int xl = x.length;
		int yl = y.length;
		int[][] DP_Table = new int[xl+1][yl+1];
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			x[i] = Integer.parseInt(st.nextToken());	
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			y[i] = Integer.parseInt(st.nextToken());	
		}
		
		// 두 문자열의 LCS의 길이를 구하는 단계
		for(int i = 0; i < xl+1; i++)
		{
			DP_Table[i][0] = 0;
		}
		
		for(int i = 0; i < yl+1; i++)
		{
			DP_Table[0][i] = 0;
		}
		
		for(int i = 1; i < xl+1; i++)
		{
			for(int j = 1; j < yl+1; j++)
			{
				if(x[i-1] == y[j-1])
					DP_Table[i][j] = DP_Table[i-1][j-1] + 1; 
				else
				{
					DP_Table[i][j] = Math.max(DP_Table[i][j-1], DP_Table[i-1][j]);
				}
			}
		}
			
		// 출력하는 단계
		bw.write(String.valueOf(DP_Table[xl][yl]));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}