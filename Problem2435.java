package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2435 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 온도를 측정한 전체 날짜의 수
		// 온도의 합을 구하기 위한 연속적인 날짜의 수 K
		int K = Integer.parseInt(st.nextToken());  
		int[] temp = new int[N];  // 측정한 온도 값들을 저장할 배열
		int max = 0;  // 온도의 수열에서 연속적인 K일의 온도의 합의 최댓값
		int sum = 0;
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
		{
			temp[i] = Integer.parseInt(st.nextToken());
		}
		
		// 온도의 수열에서 연속적인 K일의 온도의 합이 최대가 되는 값을 구하는 단계
		for(int i = 0; i < K; i++)
		{
			max += temp[i];
		}
		sum = max;
		
		for(int i = 1; i <= N-K; i++)
		{
			if(max < sum-temp[i-1]+temp[i+K-1])
				max = sum-temp[i-1]+temp[i+K-1];
			
			sum = sum-temp[i-1]+temp[i+K-1];
		}

		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}