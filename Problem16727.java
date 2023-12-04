package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem16727 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p1 = Integer.parseInt(st.nextToken());  // Persepolis의 홈 득점 수
		int s1 = Integer.parseInt(st.nextToken());  // Esteghlal의 원정 득점 수
		
		st = new StringTokenizer(br.readLine());
		int s2 = Integer.parseInt(st.nextToken());  // Esteghlal의 홈 득점 수
		int p2 = Integer.parseInt(st.nextToken());  // Persepolis의 원정 득점 수
		
		// 경기 결과를 출력하는 단계
		if((p1 + p2) > (s1 + s2))  // Persepolis의 득점 수가 더 많은 경우
			bw.write("Persepolis");
		else if((p1 + p2) < (s1 + s2))  // Esteghlal의 득점 수가 더 많은 경우
			bw.write("Esteghlal");
		else  // 두 팀의 득점 수가 같은 경우
		{
			if(p2 > s1)  // Persepolis의 원정 득점 수가 더 많은 경우
				bw.write("Persepolis");
			else if(p2 < s1)  // Esteghlal의 원정 득점 수가 더 많은 경우
				bw.write("Esteghlal");
			else  // 두 팀의 원정 득점 수가 같은 경우
				bw.write("Penalty");
		}
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}