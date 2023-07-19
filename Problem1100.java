package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1100 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		boolean isWhite = false;  // 현재 칸이 하얀 칸인지 구분
		int count = 0;  // 하얀 칸 위에 있는 말의 수
		String s = null;
		
		// 체스판에서 하얀 칸 위에 있는 말의 수를 세는 단계
		for(int i = 1; i <= 8; i++)
		{
			s = br.readLine();
			
			isWhite = !isWhite;
			
			for(int j = 0; j < 8; j++)
			{
				// 하얀 칸이면서 말이 있는 경우
				if((isWhite == true) && (s.charAt(j) == 'F'))
					count += 1;
				
				isWhite = !isWhite;
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}