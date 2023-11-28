package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2083 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하는 단계
		StringTokenizer st = null;  
		String name;  // 회원의 이름
		int age;  // 회원의 나이
		int weight;  // 회원의 몸무게
		
		// 회원들을 분류하여 출력하는 단계
		st = new StringTokenizer(br.readLine());
		name = st.nextToken();
		age = Integer.parseInt(st.nextToken());
		weight = Integer.parseInt(st.nextToken());
		
		while(!name.equals("#"))
		{
			bw.write(name + " ");
			
			if((age > 17) || (weight >= 80))
				bw.write("Senior\n");
			else
				bw.write("Junior\n");
			
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			age = Integer.parseInt(st.nextToken());
			weight = Integer.parseInt(st.nextToken());
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}