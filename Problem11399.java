package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem11399 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		int sum = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 시간의 합의 최솟값을 계산하는 단계
		for(int i = 0; i < N; i++)
		{
			numArr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(numArr);
		
		sum += numArr[0];
		
		for(int i = 1; i < N; i++)
		{
			numArr[i] = numArr[i-1] + numArr[i];
			sum += numArr[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}