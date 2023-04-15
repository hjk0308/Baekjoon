package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2446 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  
		
		// 문제에 조건에 맞게 별 찍는 단계
		for(int i = N; i >= 1; i--)
		{
			for(int j = 1; j <= N-i; j++)
				bw.write(" ");
			
			for(int k = 1; k <= 2*i-1; k++)
				bw.write("*");
			
			bw.newLine();
		}
		
		for(int i = 2; i <= N; i++)
		{
			for(int j = 1; j <= N-i; j++)
				bw.write(" ");
			
			for(int k = 1; k <= 2*i-1; k++)
				bw.write("*");
			
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}