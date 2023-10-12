package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem30031 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 지폐의 개수 
		int mm;  // 지폐의 가로 길이
		int sum = 0;  // 지폐의 총액
		
		// 가진 지폐의 총액을 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			mm = Integer.parseInt(st.nextToken());
			
			if(mm == 136)
				sum += 1000;
			else if(mm == 142)
				sum += 5000;
			else if(mm == 148)
				sum += 10000;
			else if(mm == 154)
				sum += 50000;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(sum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}