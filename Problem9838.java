package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9838 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		int n = Integer.parseInt(br.readLine());  // 손님 수
		int g;  // 선물을 준 사람
		int[] present = new int[n];  // 각 선물을 받은 사람들의 정보를 저장하기 위한 배열
		
		// 각 선물을 받은 사람들의 정보를 저장하는 단계
		for(int i = 0; i < n; i++)
		{
			g = Integer.parseInt(br.readLine());
			
			present[g-1] = (i+1); 
		}
		
		// 출력하는 단계
		for(int i = 0; i < n; i++)
		{
			bw.write(present[i] + "\n");
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}