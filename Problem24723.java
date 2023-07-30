package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem24723 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 녹색거탑의 높이
		int result = 0;  // 녹색거탑의 정상에서 바닥으로 내려오는 경우의 수
		
		// 녹색거탑의 정상에서 바닥으로 내려오는 경우의 수를 구하는 단계
		if(N == 1)
			result = 2;
		else if(N == 2)
			result = 4;
		else if(N == 3)
			result = 8;
		else if(N == 4)
			result = 16;
		else if(N == 5)
			result = 32;
		
		// 출력하는 단계
		bw.write(String.valueOf(result));

		bw.flush();
		
		br.close();
		bw.close();
	}
}