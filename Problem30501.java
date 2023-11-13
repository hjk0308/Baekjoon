package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem30501 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 용의자의 수
		String killer = null;  // 관우를 죽인 범인의 이름
		String name = null;
		
		// 관우를 죽인 범인의 이름을 찾는 단계
		for(int i = 1; i <= N; i++)
		{
			name = br.readLine();
			
			if(name.contains("S"))
				killer = name;
		}
		
		// 출력하는 단계
		bw.write(killer);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}