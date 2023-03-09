package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2609 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int n2 = Integer.parseInt(st.nextToken());
		int n1n2 = n1 * n2;
		int min = -1;  // 최소공배수
		int max = -1;  // 최대공약수
		int temp = -1;  // 임시 변수
		
		// 최대공약수와 최소공배수를 구하는 단계
 		while(n2 != 0)
 		{
 			temp = n1;
 			n1 = n2;
 			n2 = temp % n2;
 		}
 		
 		max = n1;
 		min = n1n2 / max;
		
		// 출력하는 단계
 		bw.write(String.valueOf(max));
 		bw.newLine();
 		bw.write(String.valueOf(min));
 		
		bw.flush();
		
		br.close();
		bw.close();
	}
}