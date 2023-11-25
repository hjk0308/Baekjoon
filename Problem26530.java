package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26530 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들 선언 단계
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());  // 데이터 세트의 개수
		int x;  // 상품 종류의 개수
		double quantity;  // 상품의 수량
		double price;  // 상품의 가격
		double amount;  // 상품의 총액
		
		// 각 상품의 총액을 계산해서 출력하는 단계
		for(int i = 1; i <= n; i++)
		{
			x = Integer.parseInt(br.readLine()); 
			amount = 0;
			
			for(int j = 1; j <= x; j++)
			{
				st = new StringTokenizer(br.readLine());
				st.nextToken();  // 상품 이름 버림
				quantity = Double.parseDouble(st.nextToken());
				price = Double.parseDouble(st.nextToken());
				
				amount += (quantity * price);
			}
			
			bw.write(String.format("$%.2f\n", amount));
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}