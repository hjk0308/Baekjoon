package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1789 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long S = Long.parseLong(br.readLine());
		long res = 1;
		
		// 자연수 N의 최댓값을 구하는 단계
		while(true)
		{
			if(res <= S)
			{
				S -= res;
				res += 1;
			}
			else  // i > S
			{
				break;
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res-1));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}