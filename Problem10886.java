package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10886 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 설문 조사 참여한 사람 수
		int zero = 0;  // 귀엽지 않다는 의견 수
		int one = 0;  // 귀엽다는 의견 수
		
		// 설문 조사를 해서 나온 의견을 세는 단계
		for(int i = 1; i <= N; i++)
		{
			if(Integer.parseInt(br.readLine()) == 0)
				zero += 1;
			else
				one += 1;
		}
		
		// 출력하는 단계
		if(zero > one)
			bw.write("Junhee is not cute!");
		else  // zero < one
			bw.write("Junhee is cute!");

		bw.flush();
		
		br.close();
		bw.close();
	}
}