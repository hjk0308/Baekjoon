package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Problem13277 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());  // 정수 A
		BigInteger B = new BigInteger(st.nextToken());  // 정수 B
		BigInteger result = null;
		
		// 두 수의 곱을 구하는 단계
		result = A.multiply(B);
		
		// 출력하는 단계
		bw.write(result.toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}