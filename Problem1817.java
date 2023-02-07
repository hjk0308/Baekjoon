package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1817 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int temp = M;
		int res = 0;
		int[] nums = null;
		
		// 필요한 박스의 개수의 최솟값을 구하는 단계
		if(N == 0)
		{
			bw.write("0");
		}
		else
		{
			nums = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++)
			{
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			res += 1;
			
			for(int i = 0; i < N; i++)
			{
				if(temp >= nums[i])
				{
					temp -= nums[i];
				}
				else
				{
					temp = M;
					temp -= nums[i];
					res += 1;
				}
			}
			
			bw.write(String.valueOf(res));
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}