package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10179 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스 개수 
		double price = -1.0;  // 물건 가격
		
		// 20% 할인된 가격을 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			price = Double.parseDouble(br.readLine());
			price = price * 0.8;
			
			bw.write(String.format("$%.2f", price));
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}