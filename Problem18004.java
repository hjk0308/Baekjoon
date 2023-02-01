package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem18004 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 양의 정수 A와 B를 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int res = 0;
		
		// 양의 정수 A를 양의 정수 B로 만들기 위해 필요한 최소 연산 횟수를 구하는 단계
		while(true)
		{
			if((A%2==0) && (A > B))
			{
				A /= 2;
				res += 1;
			}
			else
			{
				if(A == B)
					break;
				else
				{
					A += 1;
					res += 1;
				}
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}