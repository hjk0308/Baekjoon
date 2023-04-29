package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2455 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int max = 0;  // 최대 사람 수
		int people = 0;  // 현재 사람 수
		int n = 0;  // 기차에서 내린 사람 수 or 탄 사람 수
		StringTokenizer st = null;
		
		// 최대 사람 수를 구하는 단계
		for(int i = 1; i <= 4; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			people -= n;
			
			n = Integer.parseInt(st.nextToken());
			people += n;
			
			if(max < people)
				max = people;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}