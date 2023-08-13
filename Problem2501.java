package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Problem2501 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int result;  // N의 약수들 중 K번째로 작은 수
		ArrayList<Integer> div = new ArrayList<Integer>();  // 약수들을 저장할 배열
		
		// N의 약수들을 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			if((N % i) == 0)
				div.add(i);
		}
		
		// N의 약수들 중 K번째로 작은 수를 구하는 단계
		if(K <= div.size())
			result = div.get(K-1);
		else
			result = 0;

		// 출력하는 단계
		bw.write(String.valueOf(result));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}