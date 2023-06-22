package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem4740 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringBuffer sb = new StringBuffer(br.readLine());  // 문자열
		
		// 입력받은 문자열의 글자들을 역순으로 바꿔서 출력하는 단계
		while(!(sb.toString().equals("***")))
		{
			bw.write(sb.reverse().toString());
			bw.newLine();
			
			sb = new StringBuffer(br.readLine());
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}