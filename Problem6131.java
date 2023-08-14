package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6131 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		int count = 0;  // 힌트 조건을 만족하는 (A, B) 쌍의 개수
		
		// 힌트 조건을 만족하는 (A, B) 쌍의 개수를 구하는 단계
		for(int A = 1; A <= 500; A++)
		{
			for(int B = 1; B <= A; B++)
			{
				if((A*A) == (B*B+N))
					count += 1;
			}
		}

		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}