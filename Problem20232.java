package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem20232 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int y = Integer.parseInt(br.readLine());  
		
		// y년에 열린 콘테스트의 우승자를 출력하는 단계
		if((y == 1996) || (y == 1997) || (y == 2000) || (y == 2007) || (y == 2008)
				|| (y == 2013) || (y == 2018))
			bw.write("SPbSU");
		else if(y == 2006)
			bw.write("PetrSU, ITMO");
		else
			bw.write("ITMO");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}