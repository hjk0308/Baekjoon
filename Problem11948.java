package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem11948 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] score4 = new int[4];  // 물리, 화학, 생물, 지구과학 4 과목의 점수 저장
		int[] score2 = new int[2];  // 역사, 지리 2 과목의 점수 저장
		int maxSum = 0;  // 문제에서 구하고자 하는 점수의 최대 합
		
		// 물리, 화학, 생물, 지구과학의 점수를 입력받아서 배열에 저장
		for(int i = 0; i <= 3; i++)
		{
			score4[i] = Integer.parseInt(br.readLine());
		}
		
		// 역사, 지리의 점수를 입력받아서 배열에 저장
		for(int i = 0; i <= 1; i++)
		{
			score2[i] = Integer.parseInt(br.readLine());
		}
		
		// 물리, 화학, 생물, 지구과학 중에 세 과목과 역사, 지리 중에 한 과목의
		// 점수의 최대 합을 구하는 단계
		
		// 물리, 화학, 생물, 지구과학의 점수를 오름차순으로 정렬
		Arrays.sort(score4);
		
		// 물리, 화학, 생물, 지구과학 중 상위 세 과목의 점수를 maxSum에 더함
		maxSum += (score4[1] + score4[2] + score4[3]); 
		
		// 역사, 지리의 점수를 오름차순으로 정렬
		Arrays.sort(score2);
				
		// 역사, 지리 중 상위 한 과목의 점수를 maxSum에 더함
		maxSum += score2[1]; 
		
		// 출력하는 단계
		bw.write(String.valueOf(maxSum));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}