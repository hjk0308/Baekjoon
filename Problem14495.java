package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem14495 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine()); 
		long[] seq = new long[117];  // 피보나치 비스무리한 수열 DP 테이블(seq[0]은 사용 x)
 		
		// n번째 피보나치 비스무리한 수열을 구하는 단계
		seq[1] = 1;
		seq[2] = 1;
		seq[3] = 1;
		
		for(int i = 4; i <= n; i++)
		{
			seq[i] = seq[i-1] + seq[i-3];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(seq[n]));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}