package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem17256 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하는 단계
		StringTokenizer st = null;
		int ax, ay, az;
		int cx, cy, cz;
		
		// 입력받는 단계
		st = new StringTokenizer(br.readLine());
		ax = Integer.parseInt(st.nextToken());
		ay = Integer.parseInt(st.nextToken());
		az = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		cx = Integer.parseInt(st.nextToken());
		cy = Integer.parseInt(st.nextToken());
		cz = Integer.parseInt(st.nextToken());
		
		// b.x, b.y, b.z를 구해서 출력하는 단계
		bw.write((cx - az) + " " + (cy / ay) + " " + (cz - ax));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}