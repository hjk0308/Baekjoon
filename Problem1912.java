package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1912 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];  // 정수들을 저장할 배열
		int[] maxes = new int[N];  // 0부터 인덱스까지의 연속 최대 합을 저장할 DP 테이블
		int max = -1;  // 연속 최대 합 중에 가장 큰 합
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 연속된 몇 개의 수를 선택해서 구할 수 있는 가장 큰 합을 찾는 단계
		maxes[0] = nums[0];
		max = maxes[0];
		for(int i = 1; i < N; i++)
		{
			maxes[i] = Math.max(nums[i], nums[i]+maxes[i-1]);
			
			if(maxes[i] > max)
				max = maxes[i];
		}
				
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}