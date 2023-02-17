package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11053 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int max = -1;
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		int[] DP_Table = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
		{ 
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 가장 긴 증가하는 부분 수열의 길이를 구하는 단계
		DP_Table[0] = 1;
		for(int i = 1; i < N; i++)
		{
			DP_Table[i] = 1;
			
			for(int j = i-1; j > -1; j--)
			{
				if(nums[i] > nums[j])
					DP_Table[i] = Math.max(DP_Table[j]+1, DP_Table[i]);
			}
		}
		
		max = DP_Table[0];
		for(int i = 1; i < N; i++)
		{
			if(max < DP_Table[i])
				max = DP_Table[i];
		}
			
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}