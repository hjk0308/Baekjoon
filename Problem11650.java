package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem11650 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		int[][] loc = new int[N][2];
		StringTokenizer st = null;
		
		for(int i = 0; i < N; i++)
		{
			st = new StringTokenizer(br.readLine());
			loc[i][0] = Integer.parseInt(st.nextToken());  // x좌표
			loc[i][1] = Integer.parseInt(st.nextToken());  // y좌표
		}
		
		// 좌표를 x좌표가 증가하는 순으로, x좌표가 같다면 y좌표가 증가하는 순으로 정렬하는 단계
		Arrays.sort(loc, (x, y) -> (x[0] == y[0]) ? x[1] - y[1] : x[0] - y[0]);
		
		// 출력하는 단계
		for(int i = 0; i < N; i++)
		{
			bw.write(String.valueOf(loc[i][0]) + " " + String.valueOf(loc[i][1]) + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}