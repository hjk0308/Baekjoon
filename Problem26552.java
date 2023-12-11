package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem26552 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		int n = Integer.parseInt(br.readLine());  // 데이터 세트의 수 
		int k;  
		String s = null;
		
		// 문제의 조건에 맞는 다음 정수를 구하는 단계
		for(int i = 1; i <= n; i++)
		{
			k = Integer.parseInt(br.readLine());
			
			while(true)
			{
				k += 1;
				s = Integer.toString(k);
				
				if(!s.contains("0"))
				{
					bw.write(s + "\n");
					break;
				}
				
				k = Integer.parseInt(s);
			}
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}