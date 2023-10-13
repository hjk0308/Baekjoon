package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26561 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine()); 
		long p;  // population
		long t;  // time
		long d;  // die
		long b;  // born
		
		// 주어진 통계에 맞게 일정 시간 후에 인구를 추정하는 단계
		for(int i = 1; i <= n; i++)
		{
			st = new StringTokenizer(br.readLine());
			p = Long.parseLong(st.nextToken()); 
			t = Long.parseLong(st.nextToken()); 
			
			d = t / 7;  
			b = t / 4;
			
			p = (p - d + b);
			
			bw.write(p + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}