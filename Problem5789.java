package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem5789 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = null;  // 문자열
		int len = -1;  // 문자열의 길이
		int N = Integer.parseInt(br.readLine());  // 테스트 케이스의 개수
		
		// 문제에서 주어진 규칙에 따라 상근이가 내리는 결정에 맞게 출력하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			len = s.length();
			
			if(s.charAt((len/2)-1) == s.charAt(len/2))
				bw.write("Do-it \n");
			else
				bw.write("Do-it-Not \n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}