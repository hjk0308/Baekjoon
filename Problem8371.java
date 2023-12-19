package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem8371 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		int count = 0;  // 다른 글자 수
		int n = Integer.parseInt(br.readLine());  // 문장 수
		String o = br.readLine();  // 원래 문장
		String r = br.readLine();  // 다시 쓴 문장
		
		// 다른 글자 수를 세는 단계
		for(int i = 0; i < n; i++)
		{
			if(o.charAt(i) != r.charAt(i))
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}