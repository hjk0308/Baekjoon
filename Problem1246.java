package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem1246 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] prices = new int[M];  
		int max = 0;
		int temp = 0;
		int price = 0;
		
		for(int i = 0; i < M; i++)
		{
			prices[i] = Integer.parseInt(br.readLine());
		}
		
		// 규칙을 만족시키면서 최대 수익을 올리기 위해 책정된 가격과 최대 수익을 구하는 단계 
		Arrays.sort(prices);
		
		for(int i = 0; i < M; i++)
		{
			if(M-i <= N)
			{
				temp = prices[i]*(M-i);
			}
			else  // M-i > N
			{
				temp = prices[i]*N;
			}
			
			if(max < temp)
			{
				max = temp;
				price = prices[i];
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(price));
		bw.write(" ");
		bw.write(String.valueOf(max));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}