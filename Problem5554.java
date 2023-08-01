package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5554 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int x, y;  // 총 이동 시간 x분 y초
		int sum = 0;  // 이동 시간 합계(초 단위)
		
		for(int i = 1; i <= 4; i++)
		{
			sum += Integer.parseInt(br.readLine());
		}
		
		// 총 이동 시간 x분 y초를 구하는 단계
		x = sum / 60;
		y = sum % 60;
		
		// 출력하는 단계
		bw.write(String.valueOf(x));
		bw.newLine();
		bw.write(String.valueOf(y));

		bw.flush();
		
		br.close();
		bw.close();
	}
}