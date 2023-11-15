package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25191 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 치킨집에 있는 치킨의 총 개수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());  // 집에 있는 콜라의 개수
		int B = Integer.parseInt(st.nextToken());  // 집에 있는 맥주의 개수
		int chicken = 0;  // 시켜먹을 수 있는 치킨의 총 개수
		
		// 시켜먹을 수 있는 치킨의 총 개수를 구하는 단계
		if(N >= (A/2 + B))
			chicken = (A/2 + B);
		else
			chicken = N;
		
		// 출력하는 단계
		bw.write(String.valueOf(chicken));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}