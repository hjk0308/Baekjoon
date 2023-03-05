package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2775 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[][] people = new int[15][14];  // 문제의 조건을 만족하는 해당 집에 거주민 수를 저장하는 DP 테이블
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스 개수 T
		int k = -1;
		int n = -1;
		
		// DP 테이블을 채우는 단계
		for(int i = 0; i < 14; i++)
		{
			people[0][i] = i+1;
		}
		
		for(int i = 1; i < 15; i++)
		{
			for(int j = 0; j < 14; j++)
			{
				if(j == 0)
					people[i][j] = people[i-1][j];
				else  // j != 0
					people[i][j] = people[i][j-1] + people[i-1][j];
			}
		}
		
		// 각 테스트 케이스의 해당 집에 거주민 수를 구하는 단계
		for(int i = 0; i < T; i++)
		{
			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			
			bw.write(String.valueOf(people[k][n-1]));
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}