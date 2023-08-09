package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem23813 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String N = br.readLine();  // 정수 N
		StringBuffer sb = new StringBuffer(N); 
		int len = N.length();  // 정수 N의 길이
		long sum = 0;  // N의 회전 결과들을 모두 더한 값
		
		// N의 회전 결과들을 모두 더한 값을 구하는 단계
		sum += Long.parseLong(sb.toString());
		sb.insert(0, sb.substring(len-1, len));
		sb.deleteCharAt(len);
		
		while(!(sb.toString().equals(N)))
		{
			sum += Long.parseLong(sb.toString());
			sb.insert(0, sb.substring(len-1, len));
			sb.deleteCharAt(len);
		}
					
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}