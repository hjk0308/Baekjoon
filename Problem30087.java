package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem30087 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 진흥이가 신청한 세미나의 수
		String s = null;
		
		// 각 세미나가 어느 교실에서 열리는지 출력하는 단계
		for(int i = 1; i <= N; i++)
		{
			s = br.readLine();
			
			if(s.equals("Algorithm"))
				bw.write("204\n");
			else if(s.equals("DataAnalysis"))
				bw.write("207\n");
			else if(s.equals("ArtificialIntelligence"))
				bw.write("302\n");
			else if(s.equals("CyberSecurity"))
				bw.write("B101\n");
			else if(s.equals("Network"))
				bw.write("303\n");
			else if(s.equals("Startup"))
				bw.write("501\n");
			else if(s.equals("TestStrategy"))
				bw.write("105\n");
		}
		
		// 전체 출력하는 단계	
		bw.flush();
		
		br.close();
		bw.close();
	}
}