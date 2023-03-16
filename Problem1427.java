package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Problem1427 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String N = br.readLine();  // 정렬하려고 하는 수 N
		int len = N.length();  // 수 N의 길이
		Integer[] nums = new Integer[len];  // 수 N의 각 자리수를 저장하기 위한 배열
		
		for(int i = 0; i < len; i++)
		{
			nums[i] = Integer.parseInt(N.substring(i, i+1));
		}
		
		// 내림차순으로 정렬하는 단계
		Arrays.sort(nums, Collections.reverseOrder());
		
		// 출력하는 단계
		for(int i = 0; i < len; i++)
		{
			bw.write(String.valueOf(nums[i]));
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}