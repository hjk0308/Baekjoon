package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem11728 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 배열 A의 크기 N
		int M = Integer.parseInt(st.nextToken());  // 배열 B의 크기 M
		
		int[] nums = new int[N+M];  // 배열 A와 배열 B를 합쳐서 저장하기 위한 배열
		
		// 배열 A를 입력받는 단계
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열 B를 입력받는 단계
		st = new StringTokenizer(br.readLine());
		for(int i = N; i < N+M; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 두 배열을 합친 배열을 오름차순으로 정렬하는 단계
		Arrays.sort(nums);
		
		// 출력하는 단계
		for(int i = 0; i < nums.length; i++)
		{
			bw.write(String.valueOf(nums[i]) + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}