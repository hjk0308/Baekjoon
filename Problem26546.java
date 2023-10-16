package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26546 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		StringBuffer sb = null;
		int n = Integer.parseInt(br.readLine());
		int s, d;
		
		// 입력받은 문자열에서 특정 문자열만 삭제해서 출력하는 단계
		for(int i = 1; i <= n; i++)
		{
			st = new StringTokenizer(br.readLine());
			sb = new StringBuffer(st.nextToken());
			s = Integer.parseInt(st.nextToken());
			d = Integer.parseInt(st.nextToken());
			
			sb = sb.delete(s, d);
			bw.write(sb.toString() + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}