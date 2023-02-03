package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem16435 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] nums = new int[N];
		int idx = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 스네이크버드의 최대 길이를 구하는 단계
		Arrays.sort(nums);
		
		while(idx < nums.length)
		{
			if(nums[idx] <= L)
			{
				idx += 1;
				L += 1;
			}
			else
				break;
		}
		
		// 출력하는 단계	
		bw.write(String.valueOf(L));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}