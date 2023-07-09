package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem27889 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String name = br.readLine();  // 학교 약칭 이름
		
		// 입력받은 학교 약칭에 따라 정식 명칭을 출력하는 단계
		if(name.equals("NLCS"))
			bw.write("North London Collegiate School");
		else if(name.equals("BHA"))
			bw.write("Branksome Hall Asia");
		else if(name.equals("KIS"))
			bw.write("Korea International School");
		else if(name.equals("SJA"))
			bw.write("St. Johnsbury Academy");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}