package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10419 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());
		int t, s, d;  // 지각 시간 t, 수업을 일찍 마쳐주는 시간 s, 수업 시간 d
		
		// 수업 시간에 따른 교수님이 지각할 수 있는 최대 시간 t를 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			d = Integer.parseInt(br.readLine());
			
			t = 0;  // 지각 시간 초기화
			s = t * t;
			while(true)
			{
				if(s+t > d)
				{
					break;
				}
				
				t += 1;
				s = t * t;
			}
			
			t -= 1;  // 지각 시간 t에 -1 해준 값이 최대 시간 t 
			bw.write(t + "\n");
		}
		
		// 전체 출력하는 단계	
		bw.flush();
		
		br.close();
		bw.close();
	}
}