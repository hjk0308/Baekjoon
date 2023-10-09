package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem30088 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 부서의 개수
		int P;  // 각 부서별 직원 수
		long[] Arr = new long[N];  // 각 부서별 면담 소요 시간의 합
		long sum;  
		long result = 0;  // 모든 부서의 퇴근하는 데 걸리는 시간의 합의 최솟값
		
		// 모든 부서의 퇴근하는 데 걸리는 시간의 합의 최솟값을 구하는 단계
		for(int i = 0; i < N; i++)
		{
			sum = 0;
			st = new StringTokenizer(br.readLine());
			P = Integer.parseInt(st.nextToken());
	
			for(int j = 1; j <= P; j++)
			{	
				sum += Integer.parseInt(st.nextToken());
			}
			
			Arr[i] = sum;
		}
		
		Arrays.sort(Arr);
		sum = 0;
		
		for(int i = 0; i < N; i++)
		{
			sum += Arr[i];
			result += sum;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}