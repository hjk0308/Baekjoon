package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14645 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 출발역과 종착역을 제외한 정거장의 수
		int K = Integer.parseInt(st.nextToken());  // 출발역에서 탑승하는 사람의 수 
		
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
		}
		
		// 출력하는 단계
		bw.write("비와이");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}