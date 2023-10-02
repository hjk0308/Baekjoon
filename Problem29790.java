package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem29790 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 지원자의 문제 해결 개수 N
		int U = Integer.parseInt(st.nextToken());  // 지원자의 유니온 레벨 U
		int L = Integer.parseInt(st.nextToken());  // 지원자의 최고 레벨 L
		
		// 조건에 따라 알맞게 출력하는 단계
		if(N >= 1000)
		{
			if((U >= 8000) || (L >= 260))
				bw.write("Very Good");
			else
				bw.write("Good");
		}
		else
			bw.write("Bad");
		 
		bw.flush();
		
		br.close();
		bw.close();
	}
}