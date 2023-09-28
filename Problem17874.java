package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem17874 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());  
		int h = Integer.parseInt(st.nextToken());  
		int v = Integer.parseInt(st.nextToken()); 
		int volume; 
		
		// 네 조각 중 가장 큰 volume을 구하는 단계
		volume = Math.max(n-h, h) * Math.max(n-v, v) * 4;
		
		// 출력하는 단계 
		bw.write(String.valueOf(volume));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}