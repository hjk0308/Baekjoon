package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5596 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int S = 0;  // 민국이의 총점 S
		int T = 0;  // 만세의 총점 T
		StringTokenizer st = null;
		
		// 민국이의 총점 S를 구하는 단계
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= 4; i++)
		{	
			S += Integer.parseInt(st.nextToken()); 
		}
		
		// 만세의 총점 T를 구하는 단계
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= 4; i++)
		{	
			T += Integer.parseInt(st.nextToken()); 
		}
		
		// 출력하는 단계
		if(S > T)
			bw.write(String.valueOf(S));
		else
			bw.write(String.valueOf(T));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}