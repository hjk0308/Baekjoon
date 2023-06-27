package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11382 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer ABC = new StringTokenizer(br.readLine());  // 세 수 A, B, C
		long sum = 0;  // 세 수 A, B, C의 합 
		
		// A + B + C의 값을 구하는 단계
		for(int i = 1; i <= 3; i++)
		{
			sum += Long.parseLong(ABC.nextToken());
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}