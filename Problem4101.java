package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4101 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n1, n2;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 각 테스트 케이스마다 첫 번째 수가 두 번째 수보다 크면 Yes, 아니면 No를 출력하는 단계
		while((n1 = Integer.parseInt(st.nextToken())) != 0)
		{
			n2 = Integer.parseInt(st.nextToken());
			
			if(n1 > n2)
				bw.write("Yes\n");
			else
				bw.write("No\n");
			
			st = new StringTokenizer(br.readLine());
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}