package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem21212 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 케이크를 만드는 데 필요한 재료 종류의 개수
		int cakes = 10001;  // 만들 수 있는 케이크의 최대 개수
		int a, b;
		
		// 만들 수 있는 케이크의 최대 개수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			if((b / a) < cakes)
				cakes = b / a;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(cakes));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}