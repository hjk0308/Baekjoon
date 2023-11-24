package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem26559 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들 선언 단계
		StringTokenizer st = null;
		String[] name = null;
		int[][] num = null;
		int n = Integer.parseInt(br.readLine());  
		int m;
		
		// 입력받아 문제의 요구대로 정렬해서 출력하는 단계
		for(int i = 1; i <= n; i++)
		{
			// 초기화
			m = Integer.parseInt(br.readLine());  
			name = new String[m];
			num = new int[m][2];
			
			// 입력받아서 저장
			for(int j = 0; j < m; j++)
			{
				st = new StringTokenizer(br.readLine());
				name[j] = st.nextToken();
				num[j][0] = j;
				num[j][1] = Integer.parseInt(st.nextToken());  
			}
			
			// 정렬
			Arrays.sort(num, (a1, a2) -> a2[1] - a1[1]);
			
			// 출력
			for(int j = 0; j < m-1; j++)
			{
				bw.write(String.valueOf(name[num[j][0]]));
				bw.write(", ");
			}
			
			bw.write(name[num[m-1][0]] + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}