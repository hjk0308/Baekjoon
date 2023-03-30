package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem10867 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int t = -1;
		int n = Integer.parseInt(br.readLine()); 
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 오름차순으로 정렬하는 단계
		Arrays.sort(nums);
		
		// 출력하는 단계(같은 수는 한 번만 출력)
		t = nums[0];
		bw.write(String.valueOf(nums[0]) + " ");
		
		for(int i = 1; i < n; i++)
		{
			if(t < nums[i])
			{
				t = nums[i];
				bw.write(String.valueOf(nums[i]) + " ");
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}