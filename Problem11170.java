package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11170 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스 T
		int N = -1;
		int M = -1;
		int count = -1;  // 0의 개수
		String num = null;
		
		// 테스트 케이스마다 N부터 M까지의 0의 개수를 세는 단계
		for(int i = 0; i < T; i++)
		{
			count = 0;
			
			st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			
			for(int j = N; j <= M; j++)
			{
				num = String.valueOf(j);
				
				for(int k = 0; k < num.length(); k++)
				{
					if(num.charAt(k) == '0')
						count += 1;
				}
			}
			
			bw.write(String.valueOf(count) + "\n");
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}