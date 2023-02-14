package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9252 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String LCS = "";
		String x = br.readLine();
		String y = br.readLine();	
		int xl = x.length();
		int yl = y.length();
		int[][] DP_Table = new int[xl+1][yl+1];
		
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
				if(x.charAt(i-1) == y.charAt(j-1))
					DP_Table[i][j] = DP_Table[i-1][j-1] + 1; 
				else
				{
					DP_Table[i][j] = Math.max(DP_Table[i][j-1], DP_Table[i-1][j]);
				}
			}
		}
		
		// 두 문자열의 LCS를 구하는 단계
		int row = xl;
		int col = yl;
		
		while((row > 0) && (col > 0))
		{
			if(x.charAt(row-1) == y.charAt(col-1))
			{
				LCS = x.charAt(row-1) + LCS;
				row -= 1;
				col -= 1;
			}
			else
			{
				if(DP_Table[row][col-1] <= DP_Table[row-1][col])
				{
					row -= 1;
				}
				else
				{
					col -= 1;
				}
			}
		}
			
		// 출력하는 단계
		bw.write(String.valueOf(DP_Table[xl][yl]));
		bw.newLine();
		
		if(DP_Table[xl][yl] != 0)
			bw.write(LCS);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}