package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14720 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 우유 가게의 수
		int count = 0;  // 마실 수 있는 우유의 최대 개수
		int milk = 0;  // 규칙에 따른 마실 수 있는 현재 우유
		int shop = 0;  // 가게의 우유 종류
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 영학이가 마실 수 있는 우유의 최대 개수를 세는 단계
		for(int i = 0; i < N; i++)
		{
			shop = Integer.parseInt(st.nextToken());
			
			if(milk == shop)
			{
				count += 1;
				
				if(milk == 2)
					milk = 0;
				else
					milk += 1;
			}	
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}