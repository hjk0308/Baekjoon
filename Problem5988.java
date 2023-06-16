package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Problem5988 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 테스트 케이스의 개수
		BigInteger K = null;  
		
		// 각 테스트 케이스마다 홀수인지 짝수인지 확인하는 단계
		for(int i = 1; i <= N; i++)
		{
			K = new BigInteger(br.readLine());
	
			if(K.remainder(new BigInteger("2")).compareTo(new BigInteger("0")) == 0)
				bw.write("even\n");
			else
				bw.write("odd\n");
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}