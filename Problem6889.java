package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6889 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계  
		int n = Integer.parseInt(br.readLine());  // 형용사의 개수
		int m = Integer.parseInt(br.readLine());  // 명사의 개수
		String[] adjectives = new String[n];  // 형용사들을 저장하기 위한 배열
		String[] nouns = new String[m];  // 명사들을 저장하기 위한 배열
		
		// 형용사들을 입력받아 배열에 저장
		for(int i = 0; i < n; i++)
		{
			adjectives[i] = br.readLine();
		}
		
		// 명사들을 입력받아 배열에 저장
		for(int i = 0; i < m; i++)
		{
			nouns[i] = br.readLine();
		}
		
		// 출력하는 단계
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < m; j++)
			{
				bw.write(adjectives[i] + " as " + nouns[j] + "\n");
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}