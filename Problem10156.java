package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10156 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());  // 과자 한 개의 가격 K
		int N = Integer.parseInt(st.nextToken());  // 사려고 하는 과자의 개수 N
		int M = Integer.parseInt(st.nextToken());  // 현재 가진 돈 M
		int res = -1;  // 받아야 하는 돈의 액수
		
		// 부모님께 받아야 하는 돈의 액수를 구하는 단계
		res = (K * N) - M;
		
		// 부모님께 받아야 하는 돈이 없는 경우
		if(res < 0)
			res = 0;
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}