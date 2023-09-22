package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10768 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int m = Integer.parseInt(br.readLine());  // 입력받은 월
		int d = Integer.parseInt(br.readLine());  // 입력받은 일
		
		// 주어진 조건에 맞게 출력하는 단계
		if((m < 2) || ((m == 2) && (d < 18)))  // 2월 18일 전인 경우
			bw.write("Before");
		else if((m == 2) && (d == 18))  // 2월 18일인 경우
			bw.write("Special");
		else  // 2월 18일 후인 경우
			bw.write("After");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}