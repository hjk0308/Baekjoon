package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem28490 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());  // n rectangular frames
		int h, w;  // h = height, w = width
		int size;  // the size of a frame
		int largest = 0;  // the largest size of a frame
		
		// the area covered by the largest size frame Stuart has을 구하는 단계
		for(int i = 1; i <= n; i++)
		{
			st = new StringTokenizer(br.readLine());
			size = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
			
			if(largest < size)
				largest = size;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(largest));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}