package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2702 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스의 수 T
		int a, b, mul, temp;
		int max, min;  // max는 최대공약수, min은 최소공배수
		StringTokenizer st = null;
		
		// 각 테스트 케이스마다 두 정수 a, b의 최소공배수와 최대공약수를 구하는 단계
		for(int i = 1; i <= T; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			mul = a*b;  // 두 정수를 곱한 값
			
			// 두 정수 a, b의 최대공약수를 구함
			while(b != 0)
			{
				temp = a;
				a = b;
				b = temp%b;
			}
			
			max = a; 
			
			// 두 정수 a, b의 최소공배수를 구함
			min = mul/max;
			
			bw.write(String.valueOf(min) + " " + String.valueOf(max) + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}