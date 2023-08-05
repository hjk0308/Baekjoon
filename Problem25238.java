package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25238 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		double result;  // 몬스터의 방어율 수치
		
		// 유저가 몬스터에게 데미지를 줄 수 있는지 몬스터의 방어율 수치를 계산하는 단계
		result = a - (a * b * 0.01);

		// 출력하는 단계
		if(result < 100)
			bw.write("1");
		else  // result >= 100
			bw.write("0");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}