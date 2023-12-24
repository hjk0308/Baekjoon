package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem17884 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		int n = Integer.parseInt(br.readLine());  // 사람 수
		int d;  // 첫 번째 사람과 각 사람 사이의 수
		int[] line = new int[n-1];  // 줄 순서를 정리하기 위한 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 줄 순서를 배열을 이용하여 정리하는 단계
		for(int i = 2; i <= n; i++)
		{
			d = Integer.parseInt(st.nextToken());
			line[d] = i;
		}
		
		// 출력하는 단계
		bw.write("1 ");
		for(int i = 0; i < n-1; i++)
		{
			bw.write(String.valueOf(line[i]) + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}