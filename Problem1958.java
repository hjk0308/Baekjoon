package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1958 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String x = br.readLine();
		String y = br.readLine();	
		String z = br.readLine();
		int xl = x.length();
		int yl = y.length();
		int zl = z.length();
		int[][][] DP_Table = new int[xl+1][yl+1][zl+1];
		
		// 세 문자열의 LCS의 길이를 구하는 단계
		for(int i = 0; i < xl+1; i++)
		{
			for(int j = 0; j < yl+1; j++)
			{
				DP_Table[i][j][0] = 0;
			}
		}
		
		for(int i = 0; i < xl+1; i++)
		{
			for(int j = 0; j < zl+1; j++)
			{
				DP_Table[i][0][j] = 0;
			}
		}
		
		for(int i = 0; i < yl+1; i++)
		{
			for(int j = 0; j < zl+1; j++)
			{
				DP_Table[0][i][j] = 0;
			}
		}
		
		for(int i = 1; i < xl+1; i++)
		{
			for(int j = 1; j < yl+1; j++)
			{
				for(int k = 1; k < zl+1; k++)
				{
					if((x.charAt(i-1) == y.charAt(j-1)) && (y.charAt(j-1) == z.charAt(k-1)))
						DP_Table[i][j][k] = DP_Table[i-1][j-1][k-1] + 1; 
					else
					{
						DP_Table[i][j][k] = Math.max(Math.max(DP_Table[i-1][j][k], DP_Table[i][j-1][k]), DP_Table[i][j][k-1]);
					}
				}
			}
		}
			
		// 출력하는 단계
		bw.write(String.valueOf(DP_Table[xl][yl][zl]));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}