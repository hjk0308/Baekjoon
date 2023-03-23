package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Problem11931 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Integer[] nums = new Integer[N];
		
		// 입력받는 단계
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 내림차순으로 정렬하는 단계
		Arrays.sort(nums, Collections.reverseOrder());
		
		// 출력하는 단계
		for(int i = 0; i < N; i++)
		{
			bw.write(String.valueOf(nums[i]));
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}