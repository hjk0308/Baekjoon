package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5565 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int AllPrice = Integer.parseInt(br.readLine());  // 10권의 총 가격
		int NinePrice = 0;  // 가격을 읽을 수 있는 책 9권의 총 가격
		int price = -1;  // 가격을 읽을 수 없는 책 1권의 가격
		
		for(int i = 1; i <= 9; i++)
		{
			NinePrice += Integer.parseInt(br.readLine());
		}
		
		// 가격을 읽을 수 없는 책의 가격을 구하는 단계
		price = AllPrice - NinePrice;
		
		// 출력하는 단계
		bw.write(String.valueOf(price));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}