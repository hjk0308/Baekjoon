package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15963 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long N = Long.parseLong(st.nextToken());  // 송찬이가 필요한 배터리
		Long M = Long.parseLong(st.nextToken());  // 선생님이 가져온 배터리
		
		// 송찬이가 원하는 배터리인지 확인하는 단계
		if(N.equals(M))
			bw.write("1");
		else  // N != M
			bw.write("0");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}