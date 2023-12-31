package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem7130 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken()); 
		int H = Integer.parseInt(st.nextToken());  
		int N = Integer.parseInt(br.readLine());
		int C, B;
		int max = 0;  // the maximum amount of happiness achievable
		
		// the maximum amount of happiness achievable을 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			C = Integer.parseInt(st.nextToken()); 
			B = Integer.parseInt(st.nextToken()); 
			
			if(M*C > H*B)
				max += M*C;
			else
				max += H*B;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}