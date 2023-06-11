package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem19944 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  
		int M = Integer.parseInt(st.nextToken()); 

		// M학년이 뉴비인지 올드비인지 TLE인지 확인하는 단계
		if(M <= 2)  // 뉴비
			bw.write("NEWBIE!");
		else if(M <= N)  // 올드비
			bw.write("OLDBIE!");
		else  // M > N, TLE
			bw.write("TLE!");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}