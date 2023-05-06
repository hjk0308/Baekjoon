package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2920 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int n = -1;
		boolean bool = true;
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		// 연주한 순서에 따라 판별하는 단계
		n = Integer.parseInt(st.nextToken());
		
		if(n == 1)  // ascending인지 mixed인지 확인하는 단계
		{
			for(int i = 2; i <= 8; i++)
			{
				n = Integer.parseInt(st.nextToken());
				
				if(n != i)
				{
					bool = false;
					break;
				}
			}
			
			if(bool == true)
				bw.write("ascending");
			else
				bw.write("mixed");
		}
		else if(n == 8)  // descending인지 mixed인지 확인하는 단계
		{
			for(int i = 7; i >= 1; i--)
			{
				n = Integer.parseInt(st.nextToken());
				
				if(n != i)
				{
					bool = false;
					break;
				}
			}
			
			if(bool == true)
				bw.write("descending");
			else
				bw.write("mixed");
		}
		else  // mixed인 경우
			bw.write("mixed");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}