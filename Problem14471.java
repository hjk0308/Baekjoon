package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem14471 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 도장을 찍을 수 있는 칸의 개수 2N
		int M = Integer.parseInt(st.nextToken());  // 가지고 있는 포인트 카드의 개수 M
		int A, B;  // 포인트 카드의 당첨 도장의 개수 A, 꽝 도장의 개수 B
		int sum = 0;  // M-1개 이상의 경품을 얻기 위해 필요한 비용의 최솟값(엔 단위)
		// 각각의 포인트 카드가 경품을 가지기 위해 필요한 비용의 최솟값을 저장하기 위한 배열(엔 단위)
		int[] cost = new int[M];
		
		// 각각의 포인트 카드가 경품을 가지기 위해 필요한 비용의 최솟값을 구하는 단계
		for(int i = 0; i < M; i++)
		{
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken()); 
			B = Integer.parseInt(st.nextToken()); 
			
			if(A < N)
				cost[i] = N-A;
			else
				cost[i] = 0;
		}
		
		// 필요한 비용의 최솟값들이 저장된 배열을 오름차순으로 정렬
		Arrays.sort(cost);
		
		// M-1개 이상의 경품을 얻기 위해 필요한 비용의 최솟값을 구하는 단계
		for(int i = 0; i < M-1; i++)
		{
			sum += cost[i];
		}

		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}