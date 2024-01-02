package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5751 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계  
		int N;  // 테스트 케이스 수
		int result;  // 결과
		int Mary;  // Mary 승리 수
		int John;  // John 승리 수
		StringTokenizer st = null;
		
		// 각 테스트 케이스마다 결과를 계산해서 출력하는 단계
		while((N = Integer.parseInt(br.readLine())) != 0)
		{
			Mary = 0;
			
			st = new StringTokenizer(br.readLine());
			for(int i = 1; i <= N; i++)
			{
				result = Integer.parseInt(st.nextToken());
				
				if(result == 0)
					Mary += 1;
			}
			
			John = N - Mary;
			
			bw.write("Mary won " + Mary + " times and John won " + John + " times\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}