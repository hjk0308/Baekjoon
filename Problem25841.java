package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25841 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());  // 범위 정수1
		int num2 = Integer.parseInt(st.nextToken());  // 범위 정수2
		String digit = st.nextToken();  // 0~9 중 숫자
		String num = null;  // 정수를 문자열로 저장하기 위한 변수
		int count = 0;  // 숫자의 빈도수
		
		// 숫자의 빈도수를 세는 단계
		if(num1 == num2)  // 범위가 같은 경우
		{
			num = Integer.toString(num1);
			for(int i = 0; i < num.length(); i++)
			{
				if(num.substring(i, i+1).equals(digit))
					count += 1;
			}
		}
		else  // 범위가 다른 경우
		{
			for(int i = num1; i <= num2; i++)
			{
				num = Integer.toString(i);
				for(int j = 0; j < num.length(); j++)
				{
					if(num.substring(j, j+1).equals(digit))
						count += 1;
				}
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}