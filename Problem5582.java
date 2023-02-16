package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5582 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String x = br.readLine();
		String y = br.readLine();	
		int xl = x.length();
		int yl = y.length();
		int[][] DP_Table = new int[xl+1][yl+1];
		int max = 0;
		
		// 두 문자열에 모두 포함된 부분 문자열 중 가장 긴 부분 문자열의 길이를 구하는 단계
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
				{
					DP_Table[i][j] = DP_Table[i-1][j-1] + 1; 
					
					if(DP_Table[i][j] > max)
						max = DP_Table[i][j];
				} 
				else
				{
					DP_Table[i][j] = 0;
				}
			}
		}
			
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}