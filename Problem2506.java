package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2506 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int score = 0;  // 총 점수
		int add = 1;  // 가산점
		int result = -1;  // 채점 결과
		int N = Integer.parseInt(br.readLine()); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 주어진 채점 결과에 대하여 가산점을 고려한 총 점수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			result = Integer.parseInt(st.nextToken());
			
			if(result == 1)
			{
				score += add;
				add += 1;
			}
			else  // result == 0
				add = 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(score));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}