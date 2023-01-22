package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem4796 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int L = 0;
		int P = 0;
		int V = 0;
		int res = 0;
		int i = 1;
		
		// 입력받아 계산하는 단계
		while(true)
		{
			st = new StringTokenizer(br.readLine());
			
			L = Integer.parseInt(st.nextToken());
			P = Integer.parseInt(st.nextToken());
			V = Integer.parseInt(st.nextToken());
			
			if(L == 0)
				break;
			
			res += ((V / P) * L);
			V %= P;
			
			if(V <= L)
				res += V;
			else  // V > L
				res += L;
			
			bw.write("Case " + i + ": ");
			bw.write(String.valueOf(res));
			bw.newLine();
			
			i += 1;
			res = 0;
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}
