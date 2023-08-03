package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem16204 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  // 입력 N
		int HeadO = Integer.parseInt(st.nextToken());  // 앞 면이 O인 카드 개수, 입력 M
		int HeadX = N-HeadO;  // 앞 면이 X인 카드 개수
		int TailO = Integer.parseInt(st.nextToken());  // 뒷 면이 O인 카드 개수, 입력 K
		int TailX = N-TailO;  // 뒷 면에 X인 카드 개수
		int max = 0;  // 앞 면과 뒷 면에 같은 모양이 적혀있는 카드의 최대 개수
		
		// 앞 면과 뒷 면에 같은 모양이 적혀있는 카드의 최대 개수를 구하는 단계
		
		// 앞 면과 뒷 면의 모양이 O인 카드의 최대 개수를 구해서 더함
		max += Math.min(HeadO, TailO);
		
		// 앞 면과 뒷 면의 모양이 X인 카드의 최대 개수를 구해서 더함
		max += Math.min(HeadX, TailX);
		
		// 출력하는 단계
		bw.write(String.valueOf(max));

		bw.flush();
		
		br.close();
		bw.close();
	}
}