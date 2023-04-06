package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem26091 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 견학을 희망하는 학회원의 수 N
		int M = Integer.parseInt(st.nextToken());  // 견학하는 팀의 최소 능력치
		int[] abil = new int[N];  // 학회원들의 능력치를 저장하기 위한 배열
		int s, e;  // 각각 시작 인덱스와 끝 인덱스
		int count = 0;  // 견학 보낼 수 있는 팀의 최대 개수
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			abil[i] = Integer.parseInt(st.nextToken());
		}
		
		// 학회원들의 능력치를 오름차순으로 정렬
		Arrays.sort(abil);
		
		// 견학 보낼 수 있는 팀의 최대 개수를 구하는 단계
		s = 0;
		e = abil.length-1;
		
		while(s < e)
		{
			if(M <= (abil[s]+abil[e]))
			{
				count += 1;
				s += 1;
				e -= 1;
			}
			else
				s += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}