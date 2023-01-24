package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1049 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int s6 = 1001;  // 기타줄 6개가 들어있는 패키지의 가장 싼 가격
		int s = 1001;  // 기타줄 1개의 가장 싼 가격
		int t = 0;  // 임시로 저장할 temp
		
		int res = 0;  // 결과 
		
		// 기타줄 6개가 들어있는 패키지와 기타줄 1개의 각각의 가장 싼 가격을 구하는 단계
		for(int i = 0; i < M; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			t = Integer.parseInt(st.nextToken());
			if(t < s6)
				s6 = t;
			
			t = Integer.parseInt(st.nextToken());
			if(t < s)
				s = t;
		}
		
		// 최소 N개를 사기 위한 최소 비용을 구하는 단계
		if(s6 >= s*6)
		{
			res += (N*s);
		}
		else  // s6 < s
		{
			res += ((N/6)*s6);
			N %= 6;
			
			if(s6 < N*s)
				res += s6;
			else  // s6 >= N*s
				res += N*s;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}