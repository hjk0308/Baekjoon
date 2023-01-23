package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2864 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		// 조건에 맞는 구할 수 있는 두 수의 합 중 최솟값과 최댓값을 구하는 단계
		int max = Integer.parseInt(A.replaceAll("5", "6")) + Integer.parseInt(B.replaceAll("5", "6"));
		int min = Integer.parseInt(A.replaceAll("6", "5")) + Integer.parseInt(B.replaceAll("6", "5"));
		
		// 출력하는 단계
		bw.write(String.valueOf(min));
		bw.write(" ");
		bw.write(String.valueOf(max));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}