package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Problem11727 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		BigInteger[] DP = new BigInteger[N+1];  // DP 테이블
		
		// 2*n 크기의 직사각형을 채우는 방법의 수를 구하는 단계
		DP[0] = new BigInteger("-1");  // dummy data
		DP[1] = new BigInteger("1");
		
		if(N != 1)
		{
			DP[2] = new BigInteger("3");
			for(int k = 3; k <= N; k++)
			{ 
				DP[k] = DP[k-2].multiply(new BigInteger("2")).add(DP[k-1]);
			}
		}
				
		// 출력하는 단계
		bw.write(String.valueOf((DP[N].mod(new BigInteger("10007")))));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}