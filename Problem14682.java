package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem14682 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		int N = Integer.parseInt(br.readLine()); 
		int k = Integer.parseInt(br.readLine());  
		int sum = N;  // the shifty sum of N by k
		
		// the shifty sum of N by k을 구하는 단계
		for(int i = 1; i <= k; i++)
		{
			N *= 10;
			sum += N;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}