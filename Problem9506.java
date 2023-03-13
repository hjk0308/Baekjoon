package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9506 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = -1; 
		int sum = -1;
		
		// 테스트 케이스마다 n을 입력받아서 n이 완전수인지 판단하는 단계
		while((n = Integer.parseInt(br.readLine())) != -1)
		{
			sum = 0;
			
			for(int i = 1; i < n; i++)
			{
				if((n%i) == 0)
					sum += i;
			}
			
			if(n == sum)  // n이 완전수인 경우
			{
				bw.write(String.valueOf(n) + " = 1");
				
				for(int i = 2; i < n; i++)
				{
					if((n%i) == 0)
						bw.write(" + " + String.valueOf(i));
				}
				
				bw.newLine();
			}
			else  // n이 완전수가 아닌 경우
			{
				bw.write(String.valueOf(n) + " is NOT perfect.");
				bw.newLine();
			}
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}