package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15964 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long result;  // A @ B의 결과
		
		// A @ B의 값을 계산하는 단계
		result = (A + B) * (A - B);
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}