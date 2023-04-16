package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem10798 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[][] arr = new char[15][5];  // 글자들을 저장하기 위한 배열
		String s = null;
		
		for(int i = 0; i < 15; i++)
		{
			Arrays.fill(arr[i], '-');  // 배열의 모든 원소 값을 -로 초기화
		}
		
		// 입력받은 문자열의 각 문자를 배열에 저장하는 단계
		for(int i = 0; i < 5; i++)
		{
			s = br.readLine();
			
			for(int j = 0; j < s.length(); j++)
			{
				arr[j][i] = s.charAt(j);
			}
		}
		
		// 세로로 읽은 순서대로 글자들을 출력하는 단계
		for(int i = 0; i < 15; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(arr[i][j] != '-')
					bw.write(String.valueOf(arr[i][j]));
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}