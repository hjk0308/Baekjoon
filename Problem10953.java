package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10953 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스의 개수
		int A = -1;  
		int B = -1;  
		
		// 각 테스트 케이스마다 A+B를 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			st = new StringTokenizer(br.readLine(), ",");
			
			A = Integer.parseInt(st.nextToken());  
			B = Integer.parseInt(st.nextToken());  
			
			bw.write(String.valueOf((A+B)) + "\n");
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}