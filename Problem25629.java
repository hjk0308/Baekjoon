package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25629 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 수열의 길이
		StringTokenizer st = new StringTokenizer(br.readLine());
		int odd = 0;  // 홀수의 개수
		int even = 0;  // 짝수의 개수
					
		// 홀수와 짝수 각각의 개수를 세는 단계
		for(int i = 1; i <= N; i++)
		{
			if((Integer.parseInt(st.nextToken()) % 2) == 1)  // 홀수인 경우
				odd += 1;
			else  // 짝수인 경우
				even += 1;
		}
		
		// 홀짝 수열로 만들 수 있는지 확인하는 단계
		if((odd == even) || (odd-1 == even))
			bw.write("1");
		else
			bw.write("0");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}