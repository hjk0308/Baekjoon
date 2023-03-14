package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5635 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = Integer.parseInt(br.readLine());
		int[][] birth = new int[n][3];  // 학생들의 생일
		String[] name = new String[n];  // 학생들의 이름
		StringTokenizer st = null;
		
		int min = -1;  // 나이가 가장 적은 사람의 인덱스
		int max = -1;  // 나이가 가장 많은 사람의 인덱스
		
		for(int i = 0; i < n; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			name[i] = st.nextToken();
			birth[i][0] = Integer.parseInt(st.nextToken());  // 태어난 일
			birth[i][1] = Integer.parseInt(st.nextToken());  // 태어난 월
			birth[i][2] = Integer.parseInt(st.nextToken());  // 태어난 년도
		}
		
		// 나이가 가장 적은 사람의 인덱스를 구하는 단계
		min = 0;
		for(int i = 1; i < n; i++)
		{
			if(birth[i][2] > birth[min][2])  
				min = i;
			else if(birth[i][2] == birth[min][2])  // 태어난 년도가 같은 경우
			{
				if(birth[i][1] > birth[min][1])
					min = i;
				else if(birth[i][1] == birth[min][1])  // 태어난 월이 같은 경우
				{
					if(birth[i][0] > birth[min][0])
						min = i;
				}
			}
		}
		
		// 나이가 가장 많은 사람의 인덱스를 구하는 단계
		max = 0;
		for(int i = 1; i < n; i++)
		{
			if(birth[i][2] < birth[max][2])
				max = i;
			else if(birth[i][2] == birth[max][2])  // 태어난 년도가 같은 경우
			{
				if(birth[i][1] < birth[max][1])
					max = i;
				else if(birth[i][1] == birth[max][1])  // 태어난 월이 같은 경우
				{
					if(birth[i][0] < birth[max][0])
						max = i;
				}
			}
		}
		
		// 출력하는 단계
		bw.write(name[min]);
		bw.newLine();
		bw.write(name[max]);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}