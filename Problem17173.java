package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem17173 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] nums = new int[M];  // M개의 정수 Ki들을 저장하기 위한 배열
		int sum = 0;  // 배수들의 합을 저장하기 위한 변수
		int idx = -1;  // 인덱스
 		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++)
		{
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		// 문제에서 구하고자 하는 배수들의 합을 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			idx = 0;
			
			while(true)
			{
				if((idx == M) || (nums[idx] > i))
					break;
				
				if((i % nums[idx]) == 0)
				{
					sum += i;
					break;
				}
				
				idx += 1;
			}
		}
		
		// 출력하는 단계	
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}