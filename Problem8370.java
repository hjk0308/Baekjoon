package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem8370 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());  // 비지니스 클래스의 행의 수
		int k1 = Integer.parseInt(st.nextToken());  // 비지니스 클래스의 한 행의 좌석 수
		int n2 = Integer.parseInt(st.nextToken());  // 이코노미 클래스의 행의 수
		int k2 = Integer.parseInt(st.nextToken());  // 이코노미 클래스의 한 행의 좌석 수
		int sum;  // 이용 가능한 총 좌석 수
		
		// 비행기의 이용 가능한 총 좌석 수를 계산하는 단계
		sum = n1 * k1 + n2 * k2;
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}