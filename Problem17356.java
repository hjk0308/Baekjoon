package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem17356 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());  // 욱의 욱제력
		int B = Integer.parseInt(st.nextToken());  // 제의 욱제력
		double M = (B-A) / 400.0; 
		double result;  // 욱이 제를 이길 확률
		
		// 욱이 제를 이길 확률을 계산하는 단계
		result = 1.0 / (1+Math.pow(10, M));

		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}