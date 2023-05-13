package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem1284 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String N = null;  // 숫자 N
		char n = '-';  // 숫자 N의 각 숫자
		int len = -1;  // 호수판의 너비
		
		// 각 호수판의 너비를 구하는 단계
		N = br.readLine();
		while(N.equals("0") == false)
		{
			len = 0;
			
			for(int i = 0; i < N.length(); i++)
			{
				n = N.charAt(i);
				
				if(n == '1')  // 숫자가 1인 경우
					len += 2;
				else if(n == '0')  // 숫자가 0인 경우
					len += 4;
				else  // 숫자가 1과 0이 아닌 나머지인 경우
					len += 3;
	
			}
			
			len += (N.length()+1);
			
			bw.write(String.valueOf(len) + "\n");
			
			N = br.readLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}