package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6810 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		int sum = 91;
		int d1 = Integer.parseInt(br.readLine());
		int d2 = Integer.parseInt(br.readLine());
		int d3 = Integer.parseInt(br.readLine());
		
		// 1-3-sum을 구하는 단계
		sum += (d1 * 1 + d2 * 3 + d3 * 1);
		
		// 출력하는 단계
		bw.write("The 1-3-sum is " + sum);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}