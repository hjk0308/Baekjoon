package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem27855 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H1 = Integer.parseInt(st.nextToken());
		int B1 = Integer.parseInt(st.nextToken());
		int score1 = H1 * 3 + B1;
		
		st = new StringTokenizer(br.readLine());
		int H2 = Integer.parseInt(st.nextToken());
		int B2 = Integer.parseInt(st.nextToken());
		int score2 = H2 * 3 + B2;
		
		// 결과를 구해서 출력하는 단계
		if(score1 > score2)
			bw.write("1 " + (score1 - score2));
		else if(score1 < score2)
			bw.write("2 " + (score2 - score1));
		else
			bw.write("NO SCORE");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}