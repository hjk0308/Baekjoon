package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1934 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스 개수 T
		int A = -1;  // 수 A
		int B = -1;  // 수 B
		int AB = -1;  // 두 수 A, B의 곱
		int temp = -1;  // 일시적인 저장
		int min = -1;  // 두 수의 최소 공배수
		int max = -1;  // 두 수의 최대 공약수
		
		// 두 수 A, B의 최소 공배수를 구하는 단계
		for(int i = 0; i < T; i++)
		{
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken()); 
			B = Integer.parseInt(st.nextToken()); 
			AB = A*B;
			
			// 유클리드 호제법을 이용하여 최대 공약수를 구함
			while(B != 0)
			{
				temp = A;
				A = B;
				B = temp%B;
			}
			
			max = A;  // 최대 공약수
			min = AB / max;  // 최소 공배수
			
			bw.write(String.valueOf(min));
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}