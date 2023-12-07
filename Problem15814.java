package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15814 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		String s = null;
		StringTokenizer st = null;
		StringBuffer sb = new StringBuffer(br.readLine());
		int T = Integer.parseInt(br.readLine());
		int A, B;
		
		// 문자열에서 문자를 바꾸는 단계
		for(int i = 1; i <= T; i++)
		{
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			s = sb.substring(A, A+1);
			sb.replace(A, A+1, sb.substring(B, B+1));
			sb.replace(B, B+1, s);
		}
		
		// 출력하는 단계
		bw.write(sb.toString());
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}