package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem28097 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 공부 계획의 수 N
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = 0;  // 총합
		int days;  // 일
		int hours;  // 시간
		
		// 모든 계획을 마친 후의 소요 시간을 일과 시간 단위로 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			sum += Integer.parseInt(st.nextToken());
		}
		
		sum += (8 * (N - 1));
		
		days = sum / 24;
		hours = sum % 24;
		
		// 출력하는 단계 
		bw.write(days + " " + hours);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}