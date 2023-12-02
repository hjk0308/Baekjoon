package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem20499 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine(), "/");
		int K = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int A = Integer.parseInt(st.nextToken());
		
		// "진짜"인지 판별해서 출력하는 단계
		if(((K + A) < D) || (D == 0))
			bw.write("hasu");
		else
			bw.write("gosu");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}