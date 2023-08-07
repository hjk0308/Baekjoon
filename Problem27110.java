package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem27110 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 각 종류의 치킨 마리 수
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());  // 후라이드 치킨 선호 인원 수
		int B = Integer.parseInt(st.nextToken());  // 간장 치킨 선호 인원 수
		int C = Integer.parseInt(st.nextToken());  // 양념 치킨 선호 인원 수
		int result = 0;  // 본인이 가장 선호하는 종류의 치킨을 받을 수 있는 최대 인원 수
		
		// 본인이 가장 선호하는 종류의 치킨을 받을 수 있는 최대 인원 수를 구하는 단계
		result += Math.min(N, A);
		result += Math.min(N, B);
		result += Math.min(N, C);
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}