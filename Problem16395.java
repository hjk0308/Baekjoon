package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem16395 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());  // n번째 행에서 n
		int k = Integer.parseInt(st.nextToken());  // k번째 수에서 k
		int[][] nums = new int[n][n];  // 파스칼의 삼각형의 수를 저장할 DP 테이블
		
		// DP 테이블을 채우면서 파스칼의 삼각형에 있는 n번째 행에서 k번째 수를 구하는 단계
		nums[0][0] = 1;
		for(int i = 1; i < n; i++)
		{
			nums[i][0] = 1;
			nums[i][i] = 1;
			
			for(int j = 1; j < i; j++)
			{
				nums[i][j] = nums[i-1][j-1] + nums[i-1][j];
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(nums[n-1][k-1]));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}