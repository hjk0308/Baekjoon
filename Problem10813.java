package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10813 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 바구니의 개수 N
		int M = Integer.parseInt(st.nextToken());  // 공을 교환하는 횟수 M
		int[] basket = new int[N+1];  // basket[0]은 사용 X
		int i = -1;
		int j = -1;
		int temp = -1;
		
		// 바구니에 적혀있는 번호와 같은 번호가 적힌 공을 넣는 단계
		for(int k = 1; k <= N; k++)
		{
			basket[k] = k;
		}
		
		// 입력받은 대로 i번 바구니와 j번 바구니에 들어있는 공을 교환하는 단계
		for(int k = 1; k <= M; k++)
		{
			st = new StringTokenizer(br.readLine());
			i = Integer.parseInt(st.nextToken());
			j = Integer.parseInt(st.nextToken());
			
			temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		// 출력하는 단계
		for(int k = 1; k <= N; k++)
		{
			bw.write(String.valueOf(basket[k]) + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}