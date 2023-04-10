package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14912 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());  // 자연수 n
		char d = st.nextToken().charAt(0);  // 한 자리 숫자 d
		String s = null;
		int count = 0;  // 한 자리 숫자 d의 빈도수
		
		// 문자열에서 한 자리 숫자 d(0~9)의 빈도수를 구하는 단계
		for(int i = 1; i <= n; i++)
		{
			s = String.valueOf(i);
			
			for(int j = 0; j < s.length(); j++)
			{
				if(s.charAt(j) == d)
					count += 1;
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}