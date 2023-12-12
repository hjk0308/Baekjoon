package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem23037 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		String n = br.readLine();
		int sum = 0;  // 각 자릿수의 다섯제곱의 합
		
		// 각 자릿수의 다섯제곱의 합을 구하는 단계
		sum += Math.pow(Integer.parseInt(n.substring(0, 1)), 5);
		sum += Math.pow(Integer.parseInt(n.substring(1, 2)), 5);
		sum += Math.pow(Integer.parseInt(n.substring(2, 3)), 5);
		sum += Math.pow(Integer.parseInt(n.substring(3, 4)), 5);
		sum += Math.pow(Integer.parseInt(n.substring(4, 5)), 5);
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}