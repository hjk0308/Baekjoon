package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem28691 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String s = br.readLine();  // 동아리의 첫 번째 글자
		
		// 출력하는 단계
		if(s.equals("M"))
			bw.write("MatKor");
		else if(s.equals("W"))
			bw.write("WiCys");
		else if(s.equals("C"))
			bw.write("CyKor");
		else if(s.equals("A"))
			bw.write("AlKor");
		else if(s.equals("$"))
			bw.write("$clear");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}