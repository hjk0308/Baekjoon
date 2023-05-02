package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2490 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = -1;
		int zero = -1;  // 0의 개수
		StringTokenizer st = null;
		
		// 입력받는 단계
		for(int i = 1; i <= 3; i++)
		{
			zero = 0;
			st = new StringTokenizer(br.readLine());
			
			for(int j = 1; j <= 4; j++)
			{
				n = Integer.parseInt(st.nextToken());
				
				if(n == 0)
					zero += 1;
			}
			
			if(zero == 1)  // 도
				bw.write("A\n");
			else if(zero == 2)  // 개
				bw.write("B\n");
			else if(zero == 3)  // 걸
				bw.write("C\n");
			else if(zero == 4)  // 윷
				bw.write("D\n");
			else  // 모
				bw.write("E\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}