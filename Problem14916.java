package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem14916 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());
		int res = 0;
		int t = -1;
		
		if((n == 1) || (n == 3))
		{
			bw.write("-1");
		}
		else
		{
			// 거스름돈 동전의 최소 개수를 구하는 단계
			if((n%5 == 1) || (n%5 == 3))
			{
				t = n/5;
				res += (t-1);
				n -= (5*(t-1));
				
				res += (n/2);
				n %= 2;
			}
			else
			{
				res += (n/5);
				n %= 5;
				
				res += (n/2);
				n %= 2;
			}
			
			bw.write(String.valueOf(res));
		}
			
		
		// 출력하는 단계	
		bw.flush();
		
		br.close();
		bw.close();
	}
}