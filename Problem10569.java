package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10569 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());  // 볼록다면체의 수
		int V;  // 꼭짓점의 수
		int E;  // 모서리의 수
		int result;  // 면의 수
		
		// 각 볼록다면체의 면의 수를 계산하는 단계
		for(int i = 1; i <= T; i++)
		{
			st = new StringTokenizer(br.readLine());
			V = Integer.parseInt(st.nextToken()); 
			E = Integer.parseInt(st.nextToken());
			
			result = 2 + E - V;
			bw.write(String.valueOf(result) + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}