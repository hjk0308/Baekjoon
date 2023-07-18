package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem25630 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 소떡소떡의 길이
		String s = br.readLine();  // 소떡소떡 문자열
		int start = 0;  // 앞 인덱스
		int end = N-1;  // 뒤 인덱스
		int count = 0;  // 팰린드롬으로 만들기 위한 최소 마법 횟수
		
		// 소떡소떡을 팰린드롬 소떡소떡으로 만들기 위해 마법을 최소 몇 번 사용해야 하는지 세는 단계
		while(start <= end)
		{
			if(s.charAt(start) != s.charAt(end))
				count += 1;
			
			start += 1;
			end -= 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}