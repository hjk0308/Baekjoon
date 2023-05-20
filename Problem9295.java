package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem9295 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int sum = -1;  // 두 수의 합
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스의 개수
		StringTokenizer st = null;
		
		// 각 테스트 케이스마다 주사위를 두 번 던져 나온 두 수의 합을 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			st = new StringTokenizer(br.readLine());
			sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			
			bw.write("Case " + i + ": " + sum + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}