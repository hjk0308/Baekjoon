package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem20540 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String MBTI = br.readLine();  // 연길이의 MBTI
		String result = "";  // 연길이의 이상형 MBTI
		
		// 연길이의 이상형에 해당하는 MBTI를 찾는 단계
		if(MBTI.charAt(0) == 'E')
			result += "I";
		else
			result += "E";
		
		if(MBTI.charAt(1) == 'S')
			result += "N";
		else
			result += "S";
		
		if(MBTI.charAt(2) == 'T')
			result += "F";
		else
			result += "T";
		
		if(MBTI.charAt(3) == 'J')
			result += "P";
		else
			result += "J";
		
		// 출력하는 단계
		bw.write(result);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}