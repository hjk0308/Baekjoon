package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2476 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 참여하는 사람 수
		int result = 0;  // 가장 많은 상금을 받은 사람의 상금
		int a, b, c;  // 나온 주사위 눈
		
		// 가장 많은 상금을 받은 사람의 상금을 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken()); 
			b = Integer.parseInt(st.nextToken()); 
			c = Integer.parseInt(st.nextToken());
			
			if((a == b) && (b == c))
				result = Math.max(result, (10000+a*1000));
			else if(a == b)
				result = Math.max(result, (1000+a*100));
			else if(b == c)
				result = Math.max(result, (1000+b*100));
			else if(c == a)
				result = Math.max(result, (1000+c*100));
			else  // 모두 다른 눈인 경우
				result = Math.max(result, Math.max(a, Math.max(b, c))*100);
		}
			
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}