package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11659 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
	
		int[] nums = new int[N];
		int[] sums = new int[N];  // DP 테이블
		
		st = new StringTokenizer(br.readLine());
		
		for(int k = 0; k < N; k++)
		{ 
			nums[k] = Integer.parseInt(st.nextToken());
		}
	
		// 수 N개에서 i번째 수부터 j번째 수까지 합을 구하는 단계
		sums[0] = nums[0];
		for(int k = 1; k < N; k++)
		{
			sums[k] = sums[k-1] + nums[k];
		}
		
		int i, j;
		for(int k = 0; k < M; k++)
		{
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken())-1;  // 입력받은 구간 i를 인덱스로 변경
			j = Integer.parseInt(st.nextToken())-1;  // 입력받은 구간 j를 인덱스로 변경
			
			if(i == 0)
			{
				bw.write(String.valueOf(sums[j]));
				bw.newLine();
			}
			else
			{
				bw.write(String.valueOf((sums[j]-sums[i-1])));
				bw.newLine();
			}
		}
			
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}