package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem10797 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int count = 0;  // 10부제를 위반한 차량 수
		int n = Integer.parseInt(br.readLine());  // 주어진 날짜의 일의 자리 숫자
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 10부제를 위반한 차량의 수를 세는 단계
		for(int i = 1; i <= 5; i++)
		{
			if(n == Integer.parseInt(st.nextToken()))
				count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}