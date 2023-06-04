package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem25640 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String jinhoMBTI = br.readLine();  // 진호의 MBTI
		String MBTI = null;  // 친구들의 MBTI
		int N = Integer.parseInt(br.readLine());  // 진호의 친구의 수
		int count = 0;  // 진호와 MBTI 유형이 같은 사람의 수
		
		// 진호와 MBTI 유형이 같은 사람의 수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			MBTI = br.readLine();
			
			if(jinhoMBTI.equals(MBTI))
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}