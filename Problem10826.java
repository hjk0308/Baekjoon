package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;

public class Problem10826 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());
		List<BigInteger> fibo = new ArrayList<>();  // 피보나치 수열 DP 테이블
		
		// n번째 피보나치 수를 구하는 단계
		fibo.add(new BigInteger("0"));
		fibo.add(new BigInteger("1"));
		
		for(int i = 2; i <= n; i++)
		{
			fibo.add(fibo.get(i-1).add(fibo.get(i-2)));
		}
		
		// 출력하는 단계
		bw.write(fibo.get(n).toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}