package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26741 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());  // 닭과 소들의 총 머리 수
		int Y = Integer.parseInt(st.nextToken());  // 닭과 소들의 총 다리 수
		
		// 닭과 소의 각각의 수를 구하는 단계
		int B = Y / 2 - X;  // 소의 수
		int A = X - B;  // 닭의 수
		
		// 출력하는 단계
		bw.write(A + " " + B);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}