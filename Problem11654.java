package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem11654 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int ascii = (int) br.readLine().charAt(0);  // 아스키 코드
		
		// 출력하는 단계
		bw.write(String.valueOf(ascii));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}