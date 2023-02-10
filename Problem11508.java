package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Problem11508 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		Integer[] prices = new Integer[N];
		int min = 0;
		int idx = 0;
		
		for(int i = 0; i < N; i++)
		{
			prices[i] = Integer.parseInt(br.readLine());
		}
		
		// 조건을 만족시키면서 N개의 유제품을 살 때 필요한 최소 비용을 구하는 단계 
		Arrays.sort(prices, Collections.reverseOrder());
		
		while(idx < N)
		{
			if(((idx+1)%3) != 0)
				min += prices[idx];
			
			idx += 1;
		}
	
		// 출력하는 단계
		bw.write(String.valueOf(min));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}