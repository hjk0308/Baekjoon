package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem23351 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int[] pots= new int[N];  // 각 화분들의 수분을 저장할 배열
		int idx = 0;  // 배열 전용 인덱스
		int res = 0;  // 날짜
		boolean tf = true;  // 무한 반복문용 
		
		// 모든 캣닢이 살아 있는 기간이 최대한 길어지도록 물을 줄 때, 첫 캣닢이 죽는 날짜를 구하는 단계
		for(int i = 0; i < N; i++)
		{
			pots[i] = K;
		}
		
		while(tf)
		{
			for(int j = 0; j < A; j++)
			{
				pots[idx] += B;
				idx += 1;
				
				if(idx == N)
				{
					idx = 0;
				}
			}
			
			res += 1;
			
			for(int i = 0; i < N; i++)
			{
				pots[i] -= 1;
				
				if(pots[i] == 0)
					tf = false;
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}