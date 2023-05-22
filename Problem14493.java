package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14493 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int time = 0;  // 과일노리에 접속하기 위한 최소 필요 소요시간
		int a = -1, b = -1;  // 학인봇의 활동 정보 (a, b) a초 간격, b초 탐지
		int result = -1;
		int N = Integer.parseInt(br.readLine());  // 구간의 수
		StringTokenizer st = null;
		
		// 과일노리에 접속하기 위해 필요한 최소 소요시간을 구하는 단계
		
		// 첫 구간
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());  
		b = Integer.parseInt(st.nextToken());  
		time += b;
		time += 1;
		
		// 나머지 구간
		for(int i = 2; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());  
			b = Integer.parseInt(st.nextToken()); 
			
			result = time % (a+b);
			
			if(result < b)
				time += (b-result);
			
			time += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(time));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}