package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem24736 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int visitingScore = 0;
		int homeScore = 0;
		StringTokenizer st = null;
		
		// 점수를 구하는 단계
		
		// visiting score
		st = new StringTokenizer(br.readLine());
		visitingScore += (Integer.parseInt(st.nextToken()) * 6);
		visitingScore += (Integer.parseInt(st.nextToken()) * 3);
		visitingScore += (Integer.parseInt(st.nextToken()) * 2);
		visitingScore += (Integer.parseInt(st.nextToken()) * 1);
		visitingScore += (Integer.parseInt(st.nextToken()) * 2);
		
		// home score
		st = new StringTokenizer(br.readLine());
		homeScore += (Integer.parseInt(st.nextToken()) * 6);
		homeScore += (Integer.parseInt(st.nextToken()) * 3);
		homeScore += (Integer.parseInt(st.nextToken()) * 2);
		homeScore += (Integer.parseInt(st.nextToken()) * 1);
		homeScore += (Integer.parseInt(st.nextToken()) * 2);
		
		// 출력하는 단계
		bw.write(String.valueOf(visitingScore) + " " + String.valueOf(homeScore));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}