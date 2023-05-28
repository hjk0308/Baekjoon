package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem2752 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] nums = new int[3];  // 세 수를 저장하기 위한 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 3; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 오름차순으로 정렬
		Arrays.sort(nums);
		
		// 출력하는 단계
		for(int i = 0; i < 3; i++)
		{
			bw.write(String.valueOf(nums[i]) + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}