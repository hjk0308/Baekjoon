package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem13752 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());  // 테스트 케이스 n
		int k = -1;  // 히스토그램의 크기 k
		
		// 각 테스트 케이스에 대하여 히스토그램의 크기 k와 동일한 수의 '='를 출력하는 단계
		for(int i = 1; i <= n; i++)
		{
			k = Integer.parseInt(br.readLine());
			
			for(int j = 1; j <= k; j++)
			{
				bw.write("=");
			}
			
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}