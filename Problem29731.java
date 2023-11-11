package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem29731 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = null;
		int N = Integer.parseInt(br.readLine());  
		boolean bool = true;  // true이면 모든 문장이 Rick Astley가 만든 공약에 속함
		
		// 모든 문장이 Rick Astley가 만든 공약에 속하는지 확인하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			
			if(!s.equals("Never gonna give you up") && !s.equals("Never gonna let you down") &&
			   !s.equals("Never gonna run around and desert you") && !s.equals("Never gonna make you cry") &&
			   !s.equals("Never gonna say goodbye") && !s.equals("Never gonna tell a lie and hurt you") &&
			   !s.equals("Never gonna stop"))
			{
				bool = false;
				break;
			}
		}
		
		// 출력하는 단계
		if(bool)
			bw.write("No");
		else
			bw.write("Yes");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}