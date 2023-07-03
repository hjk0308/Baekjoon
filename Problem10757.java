package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Problem10757 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger A = new BigInteger(st.nextToken());  // 정수 A
		BigInteger B = new BigInteger(st.nextToken());  // 정수 B
		BigInteger result = null;
		
		// 두 정수의 합을 구하는 단계
		result = A.add(B);
		
		// 출력하는 단계
		bw.write(result.toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}