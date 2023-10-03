package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5724 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 각 테스트 케이스마다 입력받아서 서로 다른 정사각형의 개수를 구하는 단계
		int N;  // 그리드 한 변에 있는 정사각형의 개수 
		int count;  // 서로 다른 정사각형의 개수
		
		while((N = Integer.parseInt(br.readLine())) != 0)
		{
			count = 1;
			
			for(int i = 2; i <= N; i++)
			{
				count += (i * i);
			}
			
			bw.write(String.valueOf(count) + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}