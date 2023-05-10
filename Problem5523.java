package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5523 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int AW = 0;  // A가 이긴 횟수
		int BW = 0;  // B가 이긴 횟수
		int A = -1;
		int B = -1;
		int N = Integer.parseInt(br.readLine());  // 라운드의 수 N
		StringTokenizer st = null;
		
		// A가 이긴 횟수와 B가 이긴 횟수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if(A > B)
				AW += 1;
			else if(A < B)
				BW += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(AW) + " " + String.valueOf(BW));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}