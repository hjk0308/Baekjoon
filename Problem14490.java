package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14490 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int a = n;  // 최대공약수를 구하기 위해 n값 복사
		int b = m;  // 최대공약수를 구하기 위해 m값 복사
		int temp = -1;  // 임시 저장 변수
		
		// 두 수 n과 m의 최대공약수를 구하는 단계
		while(b != 0)
		{
			temp = a;
			a = b;
			b = temp % b;
		}
		
		// 두 수를 최대한으로 약분하는 단계
		n = n / a;
		m = m / a;
		
		// 출력하는 단계
		bw.write(String.valueOf(n) + ":" + String.valueOf(m));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}