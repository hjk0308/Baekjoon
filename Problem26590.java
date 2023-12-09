package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26590 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		String first = st.nextToken();  // 첫 번째 단어
		String second = st.nextToken();  // 두 번째 단어
		String mix = "";  // 문제에서 구하고자 하는 mixed word
		int min = Math.min(first.length(), second.length());  // 첫 번째 단어와 두 번째 단어 중 더 짧은 단어의 길이
		int odd = 1;  // 홀수 인덱스
		int even = 0;  // 짝수 인덱스
		
		// 문제에서 구하고자 하는 mixed word를 구하는 단계
		while(true)
		{
			if(min == mix.length())
				break;
			
			mix += first.substring(even, even+1);
			even += 2;
			
			if(min == mix.length())
				break;
			
			mix += second.substring(odd, odd+1);
			odd += 2;
		}
		
		// 출력하는 단계
		bw.write(mix);
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}