package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5357 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());
		String s, prev, cur;
		
		// the deduped string을 구해서 출력하는 단계
		for(int i = 1; i <= n; i++)
		{
			s = br.readLine();
			
			cur = s.substring(0, 1);
			bw.write(cur);
			
			for(int j = 1; j < s.length(); j++)
			{
				prev = cur;
				cur = s.substring(j, j+1);
				
				if(!prev.equals(cur))
					bw.write(cur);
			}
			
			bw.newLine();
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}