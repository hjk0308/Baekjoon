package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem21197 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계  
		int N = Integer.parseInt(br.readLine());  // 스톱워치를 누른 횟수
		int s, e;
		int seconds = 0;  // 스톱워치 타이머에 표시되는 초
		
		// 스톱워치 타이머의 현재 상태를 구하는 단계
		if((N % 2) == 1)
		{
			for(int i = 1; i <= N; i++)
			{
				br.readLine();
			}
			
			bw.write("still running");
		}
		else  // (N % 2) == 0
		{
			N /= 2;
			
			for(int i = 1; i <= N; i++)
			{
				s = Integer.parseInt(br.readLine());
				e = Integer.parseInt(br.readLine());
				seconds += (e-s);
			}
			
			bw.write(String.valueOf(seconds));
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}