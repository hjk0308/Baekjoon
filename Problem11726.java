package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Problem11726 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		BigInteger[] DP = new BigInteger[N];  // DP 테이블
		
		// 2*n 크기의 직사각형을 채우는 방법의 수를 구하는 단계
		DP[0] = new BigInteger("1");
		
		if(N != 1)
		{
			DP[1] = new BigInteger("2");
			for(int k = 2; k < N; k++)
			{ 
				DP[k] = DP[k-2].add(DP[k-1]);
			}
		}
				
		// 출력하는 단계
		bw.write(String.valueOf((DP[N-1].mod(new BigInteger("10007")))));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}