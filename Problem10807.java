package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10807 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 정수의 개수 N
		StringTokenizer st = new StringTokenizer(br.readLine());  // N개의 정수
		int v = Integer.parseInt(br.readLine());  // 찾으려고 하는 정수 v
		int count = 0;  // 정수 v의 개수
		
		// 정수 v의 개수를 세는 단계
		for(int i = 0; i < N; i++)
		{
			if(v == Integer.parseInt(st.nextToken()))
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}