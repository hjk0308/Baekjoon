package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1259 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String n = null;  // 입력받은 수
		int s = -1;  // 시작 인덱스
		int e = -1;  // 끝 인덱스
		boolean bool = true;  // 팰린드롬수 유무
		
		// 입력받아서 팰린드롬수인지 판단하는 단계
		n = br.readLine();
		while(!(n.equals("0")))
		{
			s = 0;
			e = n.length()-1;
			bool = true;
			
			while(s <= e)
			{
				// 팰린드롬수가 아닌 경우
				if(n.charAt(s) != n.charAt(e))
				{
					bool = false;
					break;
				}
				
				s += 1;
				e -= 1;
			}
			
			if(bool)
				bw.write("yes\n");
			else
				bw.write("no\n");
			
			n = br.readLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}