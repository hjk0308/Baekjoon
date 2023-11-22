package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4635 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int n;  // 데이터 세트의 개수
		int s;  // 속도
		int pt;  // 이전 시간
		int t;  // 시간
		int miles;  // 주행 거리
		
		// 각 데이터 세트 마다 주행 거리를 구해서 출력하는 단계 
		while((n = Integer.parseInt(br.readLine())) != -1)
		{
			pt = 0;
			miles = 0;
			
			for(int i = 1; i <= n; i++)
			{
				st = new StringTokenizer(br.readLine());
				s = Integer.parseInt(st.nextToken());
				t = Integer.parseInt(st.nextToken());
				
				miles += (s * (t-pt));
				
				pt = t;
			}
			
			bw.write(String.valueOf(miles) + " miles\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}