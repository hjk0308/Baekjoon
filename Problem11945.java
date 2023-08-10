package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11945 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuffer sb = null;
		
		// 주어진 붕어빵이 좌우로 뒤집힌 모양을 출력하는 단계
		for(int i = 1; i <= N; i++)
		{
			sb = new StringBuffer(br.readLine());
			bw.write(sb.reverse().toString());
			bw.newLine();
		}
					
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}