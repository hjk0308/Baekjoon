package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem27389 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		double n = Double.parseDouble(br.readLine());
		double result = n / 4.0;
		
		// 출력하는 단계
		bw.write(String.format("%.2f", result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}