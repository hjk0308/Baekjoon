package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26082 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());  // 경쟁사 제품의 가격
		int B = Integer.parseInt(st.nextToken());  // 경쟁사 제품의 성능
		int C = Integer.parseInt(st.nextToken());  // WARBOY의 가격 
		
		// WARBOY의 성능을 구하는 단계
		int rival = B / A;  // 경쟁사 제품의 가격 대비 성능
		int result = rival * 3 * C;  // WARBOY의 성능
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}