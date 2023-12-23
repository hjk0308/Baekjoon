package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem17548 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		String s = br.readLine();  // 받은 문자열 he...ey
		int len = s.length();  // 받은 문자열 he...ey의 길이
		
		// 받은 he...ey에서 e의 2배만큼 he...ey 형태로 출력하는 단계  
		bw.write("h" + s.substring(1, len-1) + s.substring(1, len-1) + "y");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}