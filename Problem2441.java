package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2441 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		
		// 별 찍는 단계
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < i; j++)
			{
				bw.write(" ");
			}
			
			for(int j = 0; j < N-i; j++)
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