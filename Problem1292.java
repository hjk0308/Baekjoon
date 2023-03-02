package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1292 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[]nums = new int[1000];  
		int res = 0;
		int idx = 0;
		int num = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
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
		
		// 구간에 속하는 숫자의 합을 구하는 단계
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