package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem21965 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 수열의 길이
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] A = new int[N];  // 수열 A의 수들을 저장할 배열
		int max = 0;  // 수열 A에서 가장 큰 값
		int idx = -1;  // 수열 A에서 가장 큰 값이 저장된 인덱스
		boolean bool = true;  // 수열 A가 산인 경우 true
		
		// 수열의 수들을 배열에 저장하면서 가장 큰 값을 구하는 단계
		for(int i = 0; i < N; i++)
		{
			A[i] = Integer.parseInt(st.nextToken());
			
			if(max < A[i])
			{
				max = A[i];
				idx = i;
			}
		}
		
		// 수열 A가 산인지 확인하는 단계
		if(idx == (N-1))  // 수열 A가 계속 증가하는 경우
		{
			for(int i = 0; i < idx; i++)  // 증가 부분 확인
			{
				if(A[i] >= A[i+1])
					bool = false;
			}
		}
		else  // 수열 A가 계속 증가하다가 어느 지점에서 계속 감소하는 경우
		{
			for(int i = 0; i < idx; i++)  // 증가 부분 확인
			{
				if(A[i] >= A[i+1])
					bool = false;
			}
			
			for(int i = idx; i < N-1; i++)  // 감소 부분 확인
			{
				if(A[i] <= A[i+1])
					bool = false;
			}
		}
		
		// 출력하는 단계
		if(bool)
			bw.write("YES");
		else
			bw.write("NO");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}