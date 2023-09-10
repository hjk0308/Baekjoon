package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem20254 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int UR = Integer.parseInt(st.nextToken());  
		int TR = Integer.parseInt(st.nextToken());  
		int UO = Integer.parseInt(st.nextToken()); 
		int TO = Integer.parseInt(st.nextToken());  
		int score;
		
		// score를 구하는 단계
		score = 56*UR + 24*TR + 14*UO + 6*TO;
		
		// 출력하는 단계
		bw.write(String.valueOf(score));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}