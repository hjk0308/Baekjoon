package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1453 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 필요한 변수들을 선언하고 입력받는 단계
		int num;
		int count = 0;  // 거절당하는 사람의 수
		int N = Integer.parseInt(br.readLine());  // 손님의 수 
		int[] pc = new int[100];  // 피시방 컴퓨터의 자리 유무를 저장할 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 거절당하는 사람의 수를 구하는 단계
		for(int i = 1; i <= N; i++)
		{
			num = Integer.parseInt(st.nextToken()); 
			
			if(pc[num-1] == 0)
				pc[num-1] = 1;
			else  // pc[num-1] != 0
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
			
		bw.flush();
		
		br.close();
		bw.close();
	}
}