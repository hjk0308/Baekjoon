package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Problem1271 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		BigInteger n = new BigInteger(st.nextToken());  // 가진 돈 
		BigInteger m = new BigInteger(st.nextToken());  // 생명체의 수
		
		// 출력하는 단계
		bw.write(n.divide(m).toString());
		bw.newLine();
		bw.write(n.mod(m).toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}