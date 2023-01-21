package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5585 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = 1000 - Integer.parseInt(br.readLine());
		int c = 0;
		
		// 계산하는 단계
		if(n >= 500)
		{
			c += (n / 500);
			n %= 500;
		}
		
		if(n >= 100)
		{
			c += (n / 100);
			n %= 100;
		}
		
		if(n >= 50)
		{
			c += (n / 50);
			n %= 50;
		}
		
		if(n >= 10)
		{
			c += (n / 10);
			n %= 10;
		}
		
		if(n >= 5)
		{
			c += (n / 5);
			n %= 5;
		}
		
		if(n >= 1)
		{
			c += (n / 1);
			n %= 1;
			
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(c));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}
