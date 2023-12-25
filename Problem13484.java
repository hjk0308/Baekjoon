package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem13484 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		int X = Integer.parseInt(br.readLine());  // 매달 제공되는 메가바이트 수
		int N = Integer.parseInt(br.readLine());  // 개월 수
		int P;  // 각 달에 쓴 메가바이트 수
		int T = 0;  // 현재 누적된 사용할 수 있는 메가바이트 수
		
		// N+1개월에 사용할 수 있는 메가바이트 수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			P = Integer.parseInt(br.readLine());
			T += (X-P);
		}
		
		T += X;  // N+1개월에 제공된 메가바이트
		
		// 출력하는 단계
		bw.write(String.valueOf(T));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}