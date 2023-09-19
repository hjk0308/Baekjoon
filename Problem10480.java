package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10480 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());
		int num;
		
		// 수가 홀수인지 짝수인지 구분하는 단계
		for(int i = 1; i <= n; i++)
		{
			num = Integer.parseInt(br.readLine());
			
			if((Math.abs(num) % 2) == 0)
				bw.write(num + " is even\n");
			else
				bw.write(num + " is odd\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}