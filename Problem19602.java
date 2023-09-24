package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem19602 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int S = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int L = Integer.parseInt(br.readLine());
		int score;  // happiness score
		
		// happiness score를 계산하는 단계
		score = 1 * S + 2 * M + 3 * L;
		
		// 출력하는 단계 
		if(score >= 10)
			bw.write("happy");
		else  // score < 10
			bw.write("sad");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}