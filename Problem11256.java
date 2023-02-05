package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem11256 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());  // 테스트 케이스 수
		StringTokenizer st = null;
		int J = -1;  // 사탕 수
		int N = -1;  // 상자 수
		int[] box = null;  // 상자의 가로 * 세로의 크기를 담을 배열
		int res = -1;  // 최소한의 상자 수
		int idx = -1;  // 배열 인덱스
		
		// 각 테스트 케이스의 최소 상자 개수를 구하는 단계
		for(int i = 0; i < T; i++)
		{
			st = new StringTokenizer(br.readLine());
			J = Integer.parseInt(st.nextToken()); 
			N = Integer.parseInt(st.nextToken()); 
			box = new int[N];
			
			for(int j = 0; j < N; j++)
			{
				st = new StringTokenizer(br.readLine());
				box[j] = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(box);
			
			res = 0;
			idx = box.length-1;
			
			while(J > 0)
			{
				J -= box[idx];
				idx -= 1;
				res += 1;	
			}
			
			bw.write(String.valueOf(res));
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}