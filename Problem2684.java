package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2684 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int P = Integer.parseInt(br.readLine()); 
		int[] counts = new int[8];
		String s = null;
		String ss = null;
		
		// 각 테스트 케이스의 3-동전수열의 각각의 개수를 세는 단계
		for(int i = 0; i < P; i++)
		{
			s = br.readLine();
			
			// 3-동전수열의 각 개수를 셈	
			for(int j = 0; j <= 37; j++)
			{
				ss = s.substring(j, j+3);
				
				if(ss.equals("TTT") == true)
				{
					counts[0] += 1;
				}
				else if(ss.equals("TTH") == true)
				{
					counts[1] += 1;
				}
				else if(ss.equals("THT") == true)
				{
					counts[2] += 1;
				}
				else if(ss.equals("THH") == true)
				{
					counts[3] += 1;
				}
				else if(ss.equals("HTT") == true)
				{
					counts[4] += 1;
				}
				else if(ss.equals("HTH") == true)
				{
					counts[5] += 1;
				}
				else if(ss.equals("HHT") == true)
				{
					counts[6] += 1;
				}
				else if(ss.equals("HHH") == true)
				{
					counts[7] += 1;
				}
			}
			
			// 3-동전수열의 각 개수를 출력
			for(int j = 0; j < 8; j++)
			{
				bw.write(String.valueOf(counts[j]));
				bw.write(" ");
			}
			
			bw.newLine();
			
			// 3-동전수열의 개수를 저장하는 배열의 원소 값들을 0으로 초기화
			for(int j = 0; j < 8; j++)
			{
				counts[j] = 0;
			}
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}