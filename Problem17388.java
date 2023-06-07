package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem17388 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int S = Integer.parseInt(st.nextToken());  // 숭실대 참여도
		int K = Integer.parseInt(st.nextToken());  // 고려대 참여도
		int H = Integer.parseInt(st.nextToken());  // 한양대 참여도
		int sum = S + K + H;  // 참여도의 합
		int min = -1;  // 가장 낮은 참여도
		
		// 참여도에 따라 출력하는 단계
		if(sum >= 100)  // 압박이 필요 없는 경우
			bw.write("OK");
		else  // 압박이 필요한 경우
		{
			min = Math.min(Math.min(S, K), H);
			
			if(min == S)
				bw.write("Soongsil");
			else if(min == K)
				bw.write("Korea");
			else if(min == H)
				bw.write("Hanyang");
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}