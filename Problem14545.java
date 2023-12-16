package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem14545 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		int P = Integer.parseInt(br.readLine());  // 케이스의 수  
		int l;  // 정사각형의 한 변의 길이
		long prev;  // 한 변의 길이가 (l-1)인 정사각형에서 찾을 수 있는 정사각형의 개수
		long result;  // 한 변의 길이가 l인 정사각형에서 찾을 수 있는 정사각형의 개수
		
		// 한 변의 길이가 l인 정사각형에서 찾을 수 있는 정사각형의 개수를 구하는 단계
		for(int i = 1; i <= P; i++)
		{
			l = Integer.parseInt(br.readLine()); 
			prev = 0;
			result = 0;
			
			for(int j = 1; j <= l; j++)
			{
				result = prev + j * j;
				prev = result;
			}
			
			bw.write(String.valueOf(result) + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}