package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem15813 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하는 단계
		int nameScore = 0;  // 이름점수
		int n = Integer.parseInt(br.readLine());  // 이름의 길이
		String name = br.readLine();  // 이름
		
		// 이름점수를 구하는 단계
		for(int i = 0; i < n; i++)
		{
			nameScore += (((int) name.charAt(i)) - 64);
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(nameScore));
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}