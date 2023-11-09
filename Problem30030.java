package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem30030 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int A;  // 스위트 콘의 가격
		int B = Integer.parseInt(br.readLine());  // 부가세 10%를 포함한 스위트 콘의 가격
		
		// 부가세 10%를 제외한 스위트 콘의 가격 A를 구하는 단계
		A = (B / 11) * 10;
		
		// 출력하는 단계	
		bw.write(String.valueOf(A));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}