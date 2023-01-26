package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11047 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[] numArr = new int[N];
		int c = 0;
		
		// 동전의 가치를 입력받는 단계
		for(int i = 0; i < N; i++)
		{
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		// K원을 만드는데 필요한 최소 동전의 개수를 구하는 단계
		for(int i = N-1; i > -1; i--)
		{
			c += (K/numArr[i]);
			K %= numArr[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(c));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}