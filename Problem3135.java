package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem3135 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		int min = -1;
		
		for(int i = 0; i < N; i++)
		{
			nums[i] = Integer.parseInt(br.readLine());
		}
		
		// 주파수 A에서 B로 갈 때 눌러야 하는 버튼수의 최솟값을 구하는 단계
		min = Math.abs(A-B);
		for(int i = 0; i < N; i++)
		{
			if(min > Math.abs(nums[i]-B)+1)
				min = Math.abs(nums[i]-B)+1;
		}
		
		// 출력하는 단계	
		bw.write(String.valueOf(min));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}