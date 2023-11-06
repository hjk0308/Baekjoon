package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15727 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int L = Integer.parseInt(br.readLine());  // 성우의 현재 위치와 민건이의 집까지의 거리
		int t;  // 민건이를 찾는 데 필요한 최소 시간
		
		// 민건이를 찾는 데 필요한 최소 시간을 구하는 단계
		t = L / 5;
		
		if((L % 5) != 0)
			t += 1;
		
		// 출력하는 단계
		bw.write(String.valueOf(t));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}