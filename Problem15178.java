package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15178 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 데이터 세트의 수
		int a, b, c;  // 세 각 
		
		// 세 각도의 합이 180도인지 확인하는 단계 
		for(int i = 1; i <= N; i++)
		{
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			
			if((a + b + c) == 180)
				bw.write(a + " " + b + " " + c + " Seems OK\n");
			else
				bw.write(a + " " + b + " " + c + " Check\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}