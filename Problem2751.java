package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem2751 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 오름차순으로 정렬하는 단계
		Arrays.sort(nums);
		
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