package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem29699 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = "WelcomeToSMUPC";
		int N = Integer.parseInt(br.readLine());  
		int result;
		
		// N번째에 해당하는 글자를 구해서 출력하는 단계
		result = N % 14;
		
		if(result == 0)
			N = 13;
		else
			N = result - 1;
		
		bw.write(s.substring(N, N+1));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}