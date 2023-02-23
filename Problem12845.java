package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Problem12845 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int maxGold = 0;
		int n = Integer.parseInt(br.readLine());
		Integer[] nums = new Integer[n];  // 정수들을 저장할 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 받을 수 있는 골드의 최댓값을 구하는 단계
		Arrays.sort(nums, Collections.reverseOrder());
		
		for(int i = 1; i < n; i++)
		{
			maxGold += (nums[0]+nums[i]);
		}
				
		// 출력하는 단계
		bw.write(String.valueOf(maxGold));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}