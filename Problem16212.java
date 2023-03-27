package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Problem16212 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 수열의 길이 N
		int[] a = new int[N];  // 수열의 길이가 N인 수열 a
		StringTokenizer st = new StringTokenizer(br.readLine());
 		
		for(int i = 0; i < N; i++)
		{
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		// 수열 a를 오름차순으로 정렬하는 단계
		Arrays.sort(a);
		
		// 출력하는 단계
		for(int i = 0; i < N; i++)
		{
			bw.write(String.valueOf(a[i]) + " ");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}