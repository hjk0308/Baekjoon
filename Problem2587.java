package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem2587 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 저장할 배열과 변수 선언
		int[] nums = new int[5];
		int mid = -1;
		int aver = 0;
		
		// 자연수 5개 입력받는 단계
		for(int i = 0; i < 5; i++)
		{
			nums[i] = Integer.parseInt(br.readLine());
			aver += nums[i];
		}
		
		// 평균과 중앙값을 구하는 단계
		Arrays.sort(nums);
		aver = aver / 5;
		mid = nums[2];
		
		// 출력하는 단계
		bw.write(String.valueOf(aver));
		bw.newLine();
		bw.write(String.valueOf(mid));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}