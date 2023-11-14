package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem28249 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		long N = Long.parseLong(br.readLine());  // 고추 수
		long T = 0;  // 고추들의 스코빌 지수의 합
		String s = null;
		
		// 고추들의 스코빌 지수의 합을 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			
			if(s.equals("Poblano"))
				T += 1500;
			else if(s.equals("Mirasol"))
				T += 6000;
			else if(s.equals("Serrano"))
				T += 15500;
			else if(s.equals("Cayenne"))
				T += 40000;
			else if(s.equals("Thai"))
				T += 75000;
			else if(s.equals("Habanero"))
				T += 125000;
		}	
		
		// 출력하는 단계
		bw.write(String.valueOf(T));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}