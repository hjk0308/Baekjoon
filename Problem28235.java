package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem28235 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();  // 입력받은 구호
		
		// 구호에 알맞는 응원을 출력하는 단계
		if(s.equals("SONGDO"))
			bw.write("HIGHSCHOOL");
		else if(s.equals("CODE"))
			bw.write("MASTER");
		else if(s.equals("2023"))
			bw.write("0611");
		else if(s.equals("ALGORITHM"))
			bw.write("CONTEST");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}