package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5532 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		int L = Integer.parseInt(br.readLine());  // 총 방학 일수
		int A = Integer.parseInt(br.readLine());  // 방학동안 풀어야 할 국어 페이지 총 수
		int B = Integer.parseInt(br.readLine());  // 방학동안 풀어야 할 수학 페이지 총 수
		int C = Integer.parseInt(br.readLine());  // 하루에 풀 수 있는 국어 페이지 최대 수
		int D = Integer.parseInt(br.readLine());  // 하루에 풀 수 있는 수학 페이지 최대 수
		int kDay = 0;  // 매일 최대로 풀 때, 다 푸는 데 걸리는 일수 (국어) 
		int mDay = 0;  // 매일 최대로 풀 때, 다 푸는 데 걸리는 일수 (수학) 
		int max = 0;  // 상근이가 숙제를 하지 않고 놀 수 있는 날의 최댓값
		
		// 상근이가 숙제를 하지 않고 놀 수 있는 날의 최댓값을 구하는 단계
		kDay = A / C;
		mDay = B / D;
		
		if((A % C) != 0)
			kDay += 1;
		
		if((B % D) != 0)
			mDay += 1;
		
		max = L - Math.max(kDay, mDay);
		
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}