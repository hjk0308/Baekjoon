package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem20353 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		long a = Long.parseLong(br.readLine());  // 아트리움의 면적
		double length = Math.sqrt(a) * 4;  // 아트리움에 필요한 벽의 총 길이
		
		// 출력하는 단계
		bw.write(Double.toString(length));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}