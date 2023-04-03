package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1085 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		
		// (x, y)에서 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 단계
		int min = x;
		min = Math.min(min, y);
		min = Math.min(min, (w-x));
		min = Math.min(min, (h-y));
		
		// 출력하는 단계
		bw.write(String.valueOf(min));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}