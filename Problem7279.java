package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem7279 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 버스 노선의 정류장 수
		int K = Integer.parseInt(st.nextToken());  // 버스의 좌석 수
		int a;  // 각 정류장에서 탑승한 승객 수
		int b;  // 각 정류장에서 하차한 승객 수
		int people = 0;  // 현재 버스에 탑승한 승객 수
		int max = 0;  // 한 번에 버스에 설 수 있는 최대 승객 수
		
		// 한 번에 버스에 설 수 있는 최대 승객 수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken()); 
			b = Integer.parseInt(st.nextToken()); 
			
			people += a;
			people -= b;
			
			if(max < (people-K))
				max = people-K;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}