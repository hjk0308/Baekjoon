package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Problem3724 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());  // 테스트 케이스 수 T
		StringTokenizer st = null;
		int M = -1;  // 열의 개수 M
		int N = -1;  // 행의 개수 N
		BigInteger[][] nums = null;  // 테스트 케이스마다 입력받은 행렬을 저장할 배열
		BigInteger[] mults = null;  // 테스트 케이스마다 각 열의 모든 수의 곱
		int[] maxCols = new int[T];  // 테스트 케이스의 가장 큰 값을 갖는 열의 번호
		BigInteger max = null;  // 각 테스트 케이스에서 각 열의 모든 수의 곱들 중 가장 큰 값
		int maxCol = -1;  // 각 테스트 케이스에서 각 열의 모든 수의 곱들 중 가장 큰 값을 가진 열
		
		// 입력받고 각 테스트 케이스마다 열에 있는 모든 수의 곱들 중 가장 큰 값을 갖는 열을 구하는 단계
		for(int i = 0; i < T; i++)
		{
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());  // 열의 개수 M
			N = Integer.parseInt(st.nextToken());  // 행의 개수 N
			nums = new BigInteger[N][M];
			
			// 입력받은 행렬을 배열에 저장
			for(int j = 0; j < N; j++)
			{
				st = new StringTokenizer(br.readLine());
				for(int k = 0; k < M; k++)
				{
					nums[j][k] = new BigInteger(st.nextToken());
				}
			}
			
			// 각 열마다 그 열의 모든 수들의 곱을 구함
			mults = new BigInteger[M];
			for(int j = 0; j < M; j++)
			{
				mults[j] = new BigInteger("1");
				for(int k = 0; k < N; k++)
				{
					mults[j] = mults[j].multiply(nums[k][j]);
				}
			}
			
			// 각 열의 모든 수들의 곱들 중에 가장 큰 값과 그 큰 값을 가지는 열을 구함
			// 가장 큰 값이 여러 개일 경우 번호가 가장 큰 열을 구함
			max = mults[0];
			maxCol = 1;
			for(int j = 1; j < M; j++)
			{
				if((max.compareTo(mults[j]) == 0) || (max.compareTo(mults[j]) == -1))
				{
					max = mults[j];
					maxCol = j+1;
				}
			}
			
			// 구한 열을 저장
			maxCols[i] = maxCol; 
		}
		
		// 출력하는 단계
		for(int i = 0; i < T; i++)
		{
			bw.write(String.valueOf(maxCols[i]));
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}