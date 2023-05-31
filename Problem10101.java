package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10101 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int deg1 = Integer.parseInt(br.readLine());
		int deg2 = Integer.parseInt(br.readLine());
		int deg3 = Integer.parseInt(br.readLine());
		
		// 문제의 설명에 따라 구분하는 단계
		if((deg1 == 60) && (deg2 == 60) && (deg3 == 60))
			bw.write("Equilateral");
		else if(((deg1+deg2+deg3) == 180) && ((deg1 == deg2) || (deg1 == deg3) ||
				(deg2 == deg3)))
			bw.write("Isosceles");
		else if(((deg1+deg2+deg3) == 180) && ((deg1 != deg2) && (deg1 != deg3) &&
				(deg2 != deg3)))
			bw.write("Scalene");
		else if((deg1+deg2+deg3) != 180)
			bw.write("Error");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}