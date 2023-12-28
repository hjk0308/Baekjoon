package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25277 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		int N = Integer.parseInt(br.readLine());  // 단어의 개수
		int count = 0;  // 전기 충격을 받는 횟수
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = null;
		
		// 전기 충격을 받는 횟수를 세는 단계
		for(int i = 1; i <= N; i++)
		{
			s = st.nextToken();
			
			if(s.equals("he") || s.equals("she") || s.equals("him") || s.equals("her"))
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}