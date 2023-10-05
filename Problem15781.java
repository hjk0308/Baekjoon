package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15781 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 헬멧의 개수
		int M = Integer.parseInt(st.nextToken());  // 조끼의 개수
		int temp;  // 임시 저장 변수
		int max;  // 얻을 수 있는 방어력의 최댓값
		int result = 0;  // 얻을 수 있는 헬멧과 조끼의 방어력의 합의 최댓값
		
		// 얻을 수 있는 헬멧의 방어력의 최댓값을 구하는 단계
		max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++)
		{
			temp = Integer.parseInt(st.nextToken());
			
			if(max < temp)
				max = temp;
		}
		
		result += max;
		
		// 얻을 수 있는 조끼의 방어력의 최댓값을 구하는 단계
		max = 0;
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= M; i++)
		{
			temp = Integer.parseInt(st.nextToken());
			
			if(max < temp)
				max = temp;
		}
		
		result += max;
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}