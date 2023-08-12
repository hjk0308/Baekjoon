package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25494 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스의 수
		StringTokenizer st = null;
		int a, b, c, count;
		
		// 각 테스트 케이스마다 조건을 만족하는 정수 쌍 (x, y, z)의 개수를 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			count = 0;
			
			for(int x = 1; x <= a; x++)
			{
				for(int y = 1; y <= b; y++)
				{
					for(int z = 1; z <= c; z++)
					{
						if(((x % y) == (y % z)) && ((y % z) == (z % x)))
							count += 1;
					}	
				}	
			}
			
			bw.write(String.valueOf(count));
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}