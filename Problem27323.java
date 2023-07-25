package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem27323 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int result;

		// 직사각형의 넓이를 구하는 단계
		result = A * B;
		
		// 출력하는 단계
		bw.write(String.valueOf(result));

		bw.flush();
		
		br.close();
		bw.close();
	}
}