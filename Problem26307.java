package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26307 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int HH = Integer.parseInt(st.nextToken());
		int MM = Integer.parseInt(st.nextToken());
		int sum;  // 문제를 푸는 데 소비한 시간
		
		// 문제를 푸는 데 소비한 시간을 구하는 단계
		sum = (HH-9) * 60 + MM;
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}