package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem7595 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n;
		
		// 별들의 트라이앵글들을 그리는 단계
		while((n = Integer.parseInt(br.readLine())) != 0)
		{
			for(int i = 1; i <= n; i++)
			{
				for(int j = 1; j <= i; j++)
				{
					bw.write("*");
				}
				
				bw.newLine();
			}
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}