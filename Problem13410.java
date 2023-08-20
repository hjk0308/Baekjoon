package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem13410 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 단의 수 N
		int K = Integer.parseInt(st.nextToken());  // 항의 수 K
		int max = 0;  // 주어진 단과 항에서 나올 수 있는 가장 큰 거꾸로 구구단의 값
		int reverse;  // 거꾸로 바꾼 구구단의 값
		StringBuffer sb = null;
		
		// 주어진 단과 항에서 나올 수 있는 가장 큰 거꾸로 구구단의 값을 구하는 단계
		for(int i = 1; i <= K; i++)
		{
			sb = new StringBuffer(String.valueOf(N*i));
			reverse = Integer.parseInt(sb.reverse().toString());
			
			if(max < reverse)
				max = reverse;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}