package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5717 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int M = -1;  // 남자 친구 수
		int F = -1;  // 여자 친구 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 각 테스트 케이스마다 상근이의 친구 수를 구하는 단계
		while((M = Integer.parseInt(st.nextToken())) != 0)
		{
			F = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf((M+F)) + "\n");
			st = new StringTokenizer(br.readLine());
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}