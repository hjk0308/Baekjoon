package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem24544 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		int totalSum = 0;  // 전체 콘텐츠의 흥미도의 합
		int sum = 0;  // My뷰에 등록되어 있지 않은 콘텐츠들의 흥미도의 합
		int N = Integer.parseInt(br.readLine());  // 콘텐츠의 개수
		int[] interest = new int[N];  // 각 콘텐츠의 흥미도를 저장할 배열
		StringTokenizer st = null;
		
		// 각 콘텐츠의 흥미도를 배열에 저장하면서 전체 콘텐츠의 흥미도의 합을 구하는 단계 
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			interest[i] = Integer.parseInt(st.nextToken());
			totalSum += interest[i];
		}
		
		// My뷰에 등록되어 있지 않은 콘텐츠들의 흥미도의 합을 구하는 단계 
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++)
		{
			if(Integer.parseInt(st.nextToken()) == 0)
				sum += interest[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(totalSum) + "\n");
		bw.write(String.valueOf(sum));
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}