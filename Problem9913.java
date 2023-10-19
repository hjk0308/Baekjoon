package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9913 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int num;  // 입력받을 수
		int N = Integer.parseInt(br.readLine());  // 입력받을 수들의 개수
		int[] count = new int[1001];  // 수들의 개수를 저장할 배열, count[0]은 사용 X
		int max;  // 수들의 개수 중 가장 큰 수
		
		// 수들을 입력받아서 각각의 개수를 세는 단계
		for(int i = 1; i <= N; i++)
		{
			num = Integer.parseInt(br.readLine());
			count[num] += 1;
		}
		
		// 수들의 개수 중에 가장 큰 수를 찾는 단계
		max = count[1];
		for(int i = 2; i <= 1000; i++)
		{
			if(max < count[i])
				max = count[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(max));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}