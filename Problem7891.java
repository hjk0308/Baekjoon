package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem7891 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine());  // 테스트 케이스의 수
		int x;
		int y;
		
		// 두 정수의 합을 계산하는 단계
		for(int i = 1; i <= t; i++)
		{
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf((x+y)) + "\n");
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}