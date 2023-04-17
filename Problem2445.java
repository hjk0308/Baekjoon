package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2445 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		
		// 주어진 규칙에 맞게 별을 찍는 단계
		for(int i = 1; i <= N; i++)
		{
			for(int j = 1; j <= i; j++)
			{
				bw.write("*");
			}
			
			for(int j = 1; j <= (N*2-(i*2)); j++)
			{
				bw.write(" ");
			}
			
			for(int j = 1; j <= i; j++)
			{
				bw.write("*");
			}
			
			bw.newLine();
		}
		
		for(int i = N-1; i >= 1; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				bw.write("*");
			}
			
			for(int j = 1; j <= (N*2-(i*2)); j++)
			{
				bw.write(" ");
			}
			
			for(int j = 1; j <= i; j++)
			{
				bw.write("*");
			}
			
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}