package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Problem2935 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		BigInteger A = new BigInteger(br.readLine());  // 피연산자 A
		String operator = br.readLine();  // 연산자
		BigInteger B = new BigInteger(br.readLine());  // 피연산자 B
		BigInteger result = null;  // 결과
		
		// 문제에서 주어진 조건에 따라 결과를 구하는 단계
		if(operator.equals("+"))
			result = A.add(B);
		else if(operator.equals("*"))
			result = A.multiply(B);
		
		// 출력하는 단계
		bw.write(result.toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}