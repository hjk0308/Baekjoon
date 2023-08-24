package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5522 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int sum = 0;  // JOI군의 총점
		
		// JOI군의 총점을 구하는 단계
		for(int i = 1; i <= 5; i++)
		{
			sum += Integer.parseInt(br.readLine());
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}