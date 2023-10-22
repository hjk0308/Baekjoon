package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem21300 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int refund = 0;  // total refund
		
		// total refund를 구하는 단계
		refund += Integer.parseInt(st.nextToken());  // beer
		refund += Integer.parseInt(st.nextToken());  // malt
		refund += Integer.parseInt(st.nextToken());  // wine products
		refund += Integer.parseInt(st.nextToken());  // carbonated soft drinks
		refund += Integer.parseInt(st.nextToken());  // seltzer
		refund += Integer.parseInt(st.nextToken());  // water
		refund *= 5;
		
		// 출력하는 단계
		bw.write(String.valueOf(refund));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}