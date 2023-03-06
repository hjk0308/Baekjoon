package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2033 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		double N = Double.parseDouble(br.readLine()); 
		double st = 10.0;
		
		// 문제에서 주어진 연산을 하는 단계
		while(true)
		{
			if(N > st)
			{
				N = Math.round(N/st)*st;
				st *= 10;
			}
			else
			{
				break;
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf((int)N));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}