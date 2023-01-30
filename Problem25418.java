package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25418 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 양의 정수 A와 K를 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int res = 0;
		
		// 양의 정수 A를 양의 정수 K로 만들기 위해 필요한 최소 연산 횟수를 구하는 단계
		while(true)
		{
			if((K%2==0) && (K/2 >= A))
			{
				K /= 2;
				res += 1;
			}
			else
			{
				if(K == A)
					break;
				else
				{
					K -= 1;
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