package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem13222 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 바닥에 떨어진 성냥의 개수
		int W = Integer.parseInt(st.nextToken());  // 성냥 상자의 가로 길이
		int H = Integer.parseInt(st.nextToken());  // 성냥 상자의 세로 길이
		double D = Math.sqrt(W*W + H*H);  // 성냥 상자의 대각선의 길이
		double L;  // 성냥의 길이
		
		// 성냥이 상자에 맞는지 확인해서 출력하는 단계
		for(int i = 1; i <= N; i++)
		{
			L = Double.parseDouble(br.readLine());  
			
			if(D >= L)
				bw.write("YES\n");
			else
				bw.write("NO\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}