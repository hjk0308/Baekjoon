package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10808 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] count = new int[26];  // 알파벳 소문자의 개수
		String s = br.readLine();  // 입력받은 문자열

		// 문자열에 포함된 a부터 z까지의 알파벳의 각각의 개수를 세는 단계
		for(int i = 0; i < s.length(); i++)
		{
			count[s.charAt(i)-97] += 1;
		}
		
		// 출력하는 단계
		for(int i = 0; i < 26; i++)
		{
			bw.write(count[i] + " ");
		}

		bw.flush();
		
		br.close();
		bw.close();
	}
}