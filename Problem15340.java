package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem15340 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int call, data, min;
		
		// 각 학생마다 the minimum total cost of call usage and data usage를 구하는 단계
		st = new StringTokenizer(br.readLine());
		call = Integer.parseInt(st.nextToken());
		data = Integer.parseInt(st.nextToken());
		
		while(call != 0)
		{
			min = Math.min((call*30 + data*40), Math.min((call*35 + data*30), (call*40 + data*20)));
			
			bw.write(String.valueOf(min) + "\n");
			
			st = new StringTokenizer(br.readLine());
			call = Integer.parseInt(st.nextToken());
			data = Integer.parseInt(st.nextToken());
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}