package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Problem12788 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int res = 0;
		int N = Integer.parseInt(br.readLine());
		Integer[] count = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int needs = M*K;
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++)
		{
			count[i] = Integer.parseInt(st.nextToken());
		}
		
		// 펜을 빌려야 하는 최소한의 회원의 수를 구하는 단계
		Arrays.sort(count, Collections.reverseOrder());
		
		int idx = 0;
		for(idx = 0; idx < count.length; idx++)
		{
			needs -= count[idx];
			res += 1;
			
			if(needs <= 0)
				break;
		}
			
		// 출력하는 단계
		if(idx >= count.length)
			bw.write("STRESS");
		else
			bw.write(String.valueOf(res));
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}