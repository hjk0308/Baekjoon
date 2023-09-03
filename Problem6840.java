package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem6840 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] nums = new int[3];
		
		for(int i = 0; i < 3; i++)
		{
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 배열의 원소를 오름차순으로 정렬
		Arrays.sort(nums);
		
		// 출력하는 단계
		bw.write(String.valueOf(nums[1]));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}