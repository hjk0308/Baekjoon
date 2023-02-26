package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25644 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];  // 주가를 저장하는 배열
		int[] mins = new int[N];  // 0부터 인덱스까지의 최소 주가를 저장하는 배열
		int[] maxValues = new int[N];  // 인덱스 시점까지의 얻을 수 있는 최대 이득을 저장하는 배열 
		int res = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 주식 한 주를 적당한 시점에 사고 적당한 시점에 팔아서 얻을 수 있는 최대 이득을 구하는 단계
		
		// 0부터 인덱스까지의 최소 주가를 구하는 단계
		mins[0] = nums[0];
		for(int i = 1; i < N; i++)
		{
			mins[i] = Math.min(mins[i-1], nums[i]);
		}
		
		// 인덱스 시점까지의 얻을 수 있는 최대 이득과 그 중에서 가장 최대 이득을 구하는 단계
		maxValues[0] = nums[0]-mins[0];
		res = maxValues[0];
		for(int i = 1; i < N; i++)
		{
			maxValues[i] = nums[i]-mins[i];
			
			if(maxValues[i] > res)
				res = maxValues[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}