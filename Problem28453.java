package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem28453 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 레벨의 개수
		int level;  // 레벨
		
		// 각 레벨이 속한 구간의 번호를 공백으로 구분하여 출력하는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++)
		{
			level = Integer.parseInt(st.nextToken());
			
			if(level == 300)
				bw.write("1 ");
			else if(level >= 275)
				bw.write("2 ");
			else if(level >= 250)
				bw.write("3 ");
			else  // level < 250
				bw.write("4 ");
		}
		
		// 전체 출력하는 단계 
		bw.flush();
		
		br.close();
		bw.close();
	}
}