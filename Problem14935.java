package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Problem14935 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		BigInteger bi = new BigInteger(br.readLine());
		
		// 출력하는 단계 
		bw.write("FA");  // 정수 x는 항상 FA수
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}