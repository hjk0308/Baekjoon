package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5341 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n;
		long sum;
		
		// 입력받아서 계산하고 출력하는 단계
		while((n = Long.parseLong(br.readLine())) != 0)
		{
			sum = 0;
					
			for(long i = 1; i <= n; i++)
			{
				sum += i;
			}
			
			bw.write(sum + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}