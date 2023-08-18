package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2754 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String grade = br.readLine();  // C언어의 성적
		
		// C언어의 평점을 구하는 단계
		if(grade.equals("A+"))
			bw.write("4.3");
		else if(grade.equals("A0"))
			bw.write("4.0");
		else if(grade.equals("A-"))
			bw.write("3.7");
		else if(grade.equals("B+"))
			bw.write("3.3");
		else if(grade.equals("B0"))
			bw.write("3.0");
		else if(grade.equals("B-"))
			bw.write("2.7");
		else if(grade.equals("C+"))
			bw.write("2.3");
		else if(grade.equals("C0"))
			bw.write("2.0");
		else if(grade.equals("C-"))
			bw.write("1.7");
		else if(grade.equals("D+"))
			bw.write("1.3");
		else if(grade.equals("D0"))
			bw.write("1.0");
		else if(grade.equals("D-"))
			bw.write("0.7");
		else if(grade.equals("F"))
			bw.write("0.0");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}