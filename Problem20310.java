package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem20310 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringBuffer sb = new StringBuffer(br.readLine());
		int z = 0;  // 문자열 s의 0의 개수
		int o = 0;  // 문자열 s의 1의 개수
		int idx;
		int n;
		
		// 문자열 sb에서 0의 개수를 세는 단계
		for(int i = 0; i < sb.length(); i++)
		{
			if(sb.charAt(i) == '0')
				z += 1;
		}
		
		// 문자열 sb에서 1의 개수를 구하는 단계
		o = sb.length()-z;
		
		// 절반의 0과 절반의 1을 제거하는 단계
		z /= 2;
		o /= 2;
		
		// 새로운 문자열 구성 단계
		n = sb.length();
		idx = 0;
		while(idx < n)
		{
			if(sb.charAt(idx) == '1')
			{
				sb.delete(idx, idx+1);
				o -= 1;
				n = sb.length();
			}
			else
			{
				idx += 1;
			}
			
			if(o == 0)
				break;
		}
		
		n = -1;
		idx = sb.length()-1;
		while(idx > n)
		{
			if(sb.charAt(idx) == '0')
			{
				sb.delete(idx, idx+1);
				z -= 1;
			}
		
			idx -= 1;
			
			if(z == 0)
				break;
		}
		
		// 출력하는 단계	
		bw.write(sb.toString());
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}