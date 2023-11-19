package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem17009 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int apples = 0;  // apples의 score
		int bananas = 0;  // bananas의 score
		
		// 각 팀의 점수를 계산하는 단계
		apples += Integer.parseInt(br.readLine()) * 3;
		apples += Integer.parseInt(br.readLine()) * 2;
		apples += Integer.parseInt(br.readLine()) * 1;
		
		bananas += Integer.parseInt(br.readLine()) * 3;
		bananas += Integer.parseInt(br.readLine()) * 2;
		bananas += Integer.parseInt(br.readLine()) * 1;
		
		// 점수에 따른 결과를 출력하는 단계
		if(apples > bananas)
			bw.write("A");
		else if(apples < bananas)
			bw.write("B");
		else  // apples == bananas
			bw.write("T");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}