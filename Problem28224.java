package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem28224 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());
		int price = Integer.parseInt(br.readLine());  
		
		// the final price를 계산하는 단계
		for(int i = 2; i <= n; i++)
		{
			price += Integer.parseInt(br.readLine());
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(price));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}