package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4539 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());  // 테스트 케이스 개수 
		double x = -1.0;  // 정수 x
		double st = -1.0;  // 기준 변수
		
		// 테스트 케이스마다 문제에서 주어진 연산을 하는 단계
		for(int i = 0; i < n; i++)
		{
			x = Double.parseDouble(br.readLine());
			st = 10.0;
			
			while(true)
			{
				if(x > st)
				{
					x = Math.round(x/st)*st;
					st *= 10;
				}
				else
				{
					break;
				}
			}
			
			bw.write(String.valueOf((int)x));
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}