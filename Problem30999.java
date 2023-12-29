package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem30999 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = null;
		int N = Integer.parseInt(st.nextToken());  // 문제 후보의 수
		int M = Integer.parseInt(st.nextToken());  // 출제위원의 수
		int o;  // 문제 후보 출제의 찬성 수
		int x;  // 문제 후보 출제의 반대 수
		int count = 0;  // 출제될 문제의 수
		
		// 출제될 문제의 수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			o = 0;
			x = 0;
			
			s = br.readLine();
			
			for(int j = 0; j < M; j++)
			{
				if(s.charAt(j) == 'O')
					o += 1;
				else  // s.charAt(j) == 'X'
					x += 1;
			}
			
			if(o > x)
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}