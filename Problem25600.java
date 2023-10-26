package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25600 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 참가자의 수
		int a;  // 애드혹 문제 해결을 통해 얻은 점수
		int d;  // 다이나믹 프로그래밍 문제 해결을 통해 얻은 점수
		int g;  // 그리디 알고리즘 문제 해결을 통해 얻은 점수
		int score;  // 참가자가 받은 점수
		int max = -1;  // 참가자들이 받은 점수 중에서 가장 높은 점수
		
		// 참가자들이 받은 점수 중에서 가장 높은 점수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			g = Integer.parseInt(st.nextToken());
			
			if(a == (d + g))
				score = ((a * (d + g)) * 2);
			else 
				score = (a * (d + g));
			
			if(max < score)
				max = score;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}