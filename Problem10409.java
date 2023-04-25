package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10409 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());  // 일의 개수
		int T = Integer.parseInt(st.nextToken());  // 서버 할당 시간 T
		int[] time = new int[n];  // 각 일의 수행 시간을 저장하기 위한 배열
		int count = 0;  // 수행한 일의 개수
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
		{
			time[i] = Integer.parseInt(st.nextToken());
		}
		
		// FCFS의 규칙에 따라 처리될 때, T분 안에 완료될 수 있는 일들의 개수를 세는 단계
		for(int i = 0; i < n; i++)
		{
			if(T >= time[i])
			{
				T -= time[i];
				count += 1;
			}
			else
				break;
		}
		
		// 출력하는 단계	
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}