package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15873 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();  // 자연수 A, B
		int len = s.length();  // 자연수 A, B의 길이
		int result;  // A+B 값
		
		// A+B의 값을 구하는 단계
		if(len == 2)
		{
			result = Integer.parseInt(s.substring(0, 1)) 
				   + Integer.parseInt(s.substring(1, 2));
		}
		else if(len == 3)
		{
			if(Integer.parseInt(s.substring(0, 2)) == 10)
				result = 10 + Integer.parseInt(s.substring(2, 3));
			else  // Integer.parseInt(s.substring(1, 3)) == 10
				result = Integer.parseInt(s.substring(0, 1)) + 10;
		}
		else  // len == 4, 즉 10+10
			result = 20;
					
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}