package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem16486 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		double d1 = Double.parseDouble(br.readLine());  // 영역 C의 가로의 길이
		double d2 = Double.parseDouble(br.readLine());  // 영역 A의 반지름의 길이
		double result;  // 운동장 한 바퀴 둘레
		
		// 운동장의 한 바퀴 둘레를 계산하는 단계
		result = 2 * 3.141592 * d2 + d1 * 2;
		
		// 출력하는 단계
		bw.write(String.valueOf(result));

		bw.flush();
		
		br.close();
		bw.close();
	}
}