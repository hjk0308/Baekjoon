package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem24606 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		String password1 = br.readLine();  // 비밀번호 1
		String password2 = br.readLine();  // 비밀번호 2
		int correct = 0;  // 두 개의 비밀번호의 일치하는 개수
		int result;  // 프로그래머를 시스템에 로그인 시키는 고유한 4자리의 개수 
		
		// 프로그래머를 시스템에 로그인 시키는 고유한 4자리의 개수를 구하는 단계
		for(int i = 0; i <= 3; i++)
		{
			if(password1.charAt(i) == password2.charAt(i))
				correct += 1;
		}
		
		result = (int) Math.pow(2, (4 - correct));
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}