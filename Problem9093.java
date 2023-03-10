package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem9093 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		String s = null;
		
		// 주어진 문장의 단어를 모두 뒤집는 단계
 		for(int i = 0; i < T; i++)
 		{
 			st = new StringTokenizer(br.readLine());
 			
 			while(st.hasMoreTokens())
 			{
 				s = st.nextToken();
 				
 				for(int j = s.length()-1; j > -1; j--)
 				{
 					bw.write(s.charAt(j));
 				}
 				
 				bw.write(" ");
 			}
 			
 			bw.newLine();
 		}
		
		// 출력하는 단계
 		bw.flush();
		
		br.close();
		bw.close();
	}
}