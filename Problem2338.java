package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Problem2338 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		BigInteger A = new BigInteger(br.readLine());
		BigInteger B = new BigInteger(br.readLine());
		
		// 출력하는 단계
		bw.write(A.add(B).toString() + "\n");
		bw.write(A.subtract(B).toString() + "\n");
		bw.write(A.multiply(B).toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}