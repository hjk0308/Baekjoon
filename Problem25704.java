package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem25704 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 출석 도장의 개수
		int P = Integer.parseInt(br.readLine());  // 물건의 가격
		int min;  // 지불해야 하는 최소 금액
		
		// 경태가 지불해야 하는 최소 금액을 구하는 단계
		if(N >= 20)
			min = Math.min(P-500, Math.min((int) (P*0.9), 
				  Math.min(P-2000, (int) (P*0.75))));
		else if(N >= 15)
			min = Math.min(P-500, Math.min((int) (P*0.9), P-2000));
		else if(N >= 10)
			min = Math.min(P-500, (int) (P*0.9));
		else if(N >= 5)
			min = P-500;
		else  // N < 5
			min = P;
		
		// 할인 금액이 물건의 가격보다 더 큰 경우
		if(min < 0)
			min = 0;
		
		// 출력하는 단계
		bw.write(String.valueOf(min));

		bw.flush();
		
		br.close();
		bw.close();
	}
}