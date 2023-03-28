package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Problem13699 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine()); 
		BigInteger[] t = new BigInteger[n+1];  // 수열 t(n)의 DP 테이블
		BigInteger bi = null;
 		
		// 문제에서 주어진 점화식에 의해 정의된 수열 t(n)에서 t(n)값을 구하는 단계
		t[0] = new BigInteger("1");
		for(int i = 1; i <= n; i++)
		{
			bi = new BigInteger("0");
			for(int j = 0; j < i; j++)
			{
				bi = bi.add(t[j].multiply(t[i-(j+1)]));
			}
			
			t[i] = bi;
		}
		
		// 출력하는 단계
		bw.write(t[n].toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
