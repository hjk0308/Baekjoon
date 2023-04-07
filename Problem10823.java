package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10823 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String S = "";  // 문자열 S
		String rcv = null;
		long sum = 0;  // 자연수의 합
		
		while((rcv = br.readLine()) != null)
		{
			S += rcv;
		}
		
		// 문자열 S에 포함되어 있는 자연수의 합을 구하는 단계
		StringTokenizer st = new StringTokenizer(S, ",");
		
		while(st.hasMoreTokens())
		{
			sum += Long.parseLong(st.nextToken());
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}