package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem14909 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int count = 0;  // 양의 정수의 개수 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 양의 정수의 개수를 세는 단계
		while(st.hasMoreTokens())
		{
			if(Integer.parseInt(st.nextToken()) > 0)
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}