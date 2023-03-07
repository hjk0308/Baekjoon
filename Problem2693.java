package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem2693 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine()); 
		int[] nums = new int[10];
		StringTokenizer st = null;
		
		// 각 테스트 케이스에 대해 3번째 큰 값을 구하는 단계
		for(int i = 0; i < T; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < 10; j++)
			{
				nums[j] = Integer.parseInt(st.nextToken()); 
			}
			
			Arrays.sort(nums);
			
			bw.write(String.valueOf(nums[7]));
			bw.newLine();
			
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}