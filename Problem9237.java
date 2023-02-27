package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Problem9237 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());
		Integer[] days = new Integer[N];  // 각 나무가 다 자라는데 걸리는 일수를 저장하는 배열
		int res = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			days[i] = Integer.parseInt(st.nextToken());
		}
		
		// 마지막 나무가 다 자란 다음날 이장님을 초대하려고 할 때, 이장님을 최대한 빨리 초대할 수 있는 날짜를 구하는 단계
		Arrays.sort(days, Collections.reverseOrder());
		
		res = days[0];
		for(int i = 1; i < N; i++)
		{
			days[i] += i;
			
			if(res < days[i])
				res = days[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res+2));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}