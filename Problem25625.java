package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25625 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int min;  // 최소 시간
		
		// 문제에서 구하고자 하는 최소 시간을 계산하는 단계
		if(x <= y)
			min = y-x;
		else  // x > y
			min = y+x;
	
		// 출력하는 단계 
		bw.write(String.valueOf(min));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}