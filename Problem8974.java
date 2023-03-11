package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem8974 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[]nums = new int[1000];  // 수열을 저장하는 배열
		int res = 0;
		int idx = 0;
		int num = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());  // 양의 정수 A
		int B = Integer.parseInt(st.nextToken());  // 양의 정수 B
		
		// 문제에서 주어진 조건을 만족하는 수열을 만드는 단계
		while(true)
		{
			for(int i = 1; i <= num; i++)
			{
				if(idx >= 1000)
					break;
				
				nums[idx] = num;
				idx += 1;
			}
			
			if(idx >= 1000)
				break;
			
			num += 1;
		}
		
		// 수열에서 A번째와 B번째 사이에 있는 모든 수들의 합을 구하는 단계
		for(int i = A-1; i < B; i++)
		{
			res += nums[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}