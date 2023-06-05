package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem13118 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 사람의 위치
		long p1 = Integer.parseInt(st.nextToken());
		long p2 = Integer.parseInt(st.nextToken());
		long p3 = Integer.parseInt(st.nextToken());
		long p4 = Integer.parseInt(st.nextToken());
		
		// 사과의 위치
		st = new StringTokenizer(br.readLine());
		long x = Integer.parseInt(st.nextToken());
		long y = Integer.parseInt(st.nextToken());
		long r = Integer.parseInt(st.nextToken());
		
		// 사과와 충돌하는 사람이 있는지 확인하는 단계
		if(x == p1)
			bw.write("1");
		else if(x == p2)
			bw.write("2");
		else if(x == p3)
			bw.write("3");
		else if(x == p4)
			bw.write("4");
		else
			bw.write("0");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}