package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26532 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int field = Integer.parseInt(st.nextToken()) * 
				    Integer.parseInt(st.nextToken());  // 필드의 면적
		int seed = 0;  // 필요한 옥수수 종자의 자루 수  
		
		// 필요한 옥수수 종자의 자루 수를 구하는 단계
		seed = field / (4840 * 5);
		
		if((field % (4840 * 5)) != 0)
			seed += 1;
		
		// 출력하는 단계
		bw.write(String.valueOf(seed));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}