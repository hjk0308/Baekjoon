package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5543 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int A = Integer.parseInt(br.readLine());  // 상덕버거 가격
		int B = Integer.parseInt(br.readLine());  // 중덕버거 가격
		int C = Integer.parseInt(br.readLine());  // 하덕버거 가격
		int D = Integer.parseInt(br.readLine());  // 콜라 가격
		int E = Integer.parseInt(br.readLine());  // 사이다 가격
		int price;
		
		// 가장 싼 세트 메뉴의 가격을 구하는 단계
		price = Math.min(A, Math.min(B, C)) + Math.min(D, E) - 50;
		
		// 출력하는 단계
		bw.write(String.valueOf(price));

		bw.flush();
		
		br.close();
		bw.close();
	}
}