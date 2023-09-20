package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem6825 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		double w = Double.parseDouble(br.readLine());  // weight
		double h = Double.parseDouble(br.readLine());  // height
		
		// BMI를 구하는 단계
		double BMI = w / (h * h);  // BMI
		
		// 출력하는 단계
		if(BMI > 25.0)
			bw.write("Overweight");
		else if(BMI < 18.5)
			bw.write("Underweight");
		else  // 18.5 <= BMI <= 25.0
			bw.write("Normal weight");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}