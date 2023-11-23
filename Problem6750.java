package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6750 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();  // 입력받은 문자열
		int len = s.length();  // 문자열의 길이 
		boolean use = true;  // sign으로 사용될 수 있는지 여부
		char ch;  // 임시 문자 저장
		
		// 문자열이 sign으로 사용될 수 있는지 확인하는 단계
		for(int i = 0; i < len; i++)
		{
			ch = s.charAt(i);
			
			if((ch != 'I') && (ch != 'O') && (ch != 'S') && (ch != 'H') &&
			   (ch != 'Z') && (ch != 'X') && (ch != 'N'))
			{
				use = false;
				break;
			}
		}
		
		// 출력하는 단계
		if(use)
			bw.write("YES");
		else
			bw.write("NO");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}