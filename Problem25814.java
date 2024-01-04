package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25814 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계  
		StringTokenizer st = new StringTokenizer(br.readLine());
		String num1 = st.nextToken();  // 첫 번째 정수
		String num2 = st.nextToken();  // 두 번째 정수
		int len1 = num1.length();  // 첫 번째 정수의 길이
		int len2 = num2.length();  // 두 번째 정수의 길이
		int weight1 = 0;  // 첫 번째 정수의 가중치
		int weight2 = 0;  // 두 번째 정수의 가중치
		
		// 첫 번째 정수의 가중치를 구하는 단계
		for(int i = 0; i < len1; i++)
		{
			weight1 += Integer.parseInt(num1.substring(i, i+1));
		}
		
		weight1 *= len1;
		
		// 두 번째 정수의 가중치를 구하는 단계
		for(int i = 0; i < len2; i++)
		{
			weight2 += Integer.parseInt(num2.substring(i, i+1));
		}
		
		weight2 *= len2;
		
		// 문제의 조건에 맞게 출력하는 단계
		if(weight1 > weight2)
			bw.write("1");
		else if(weight1 < weight2)
			bw.write("2");
		else  // weight1 == weight2
			bw.write("0");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}