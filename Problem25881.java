package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25881 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int firstUsage = Integer.parseInt(st.nextToken());  // 첫 1000KWH의 1KWH당 가격
		int addUsage = Integer.parseInt(st.nextToken());  // 첫 1000KWH 이후의 1KWH당 가격
		int n = Integer.parseInt(br.readLine());  // 고객 수
		int consumption;  // 고객의 전기 사용량(KWH)
		int charge;  // 전기 요금
		
		// 각 고객의 전기 요금을 계산해서 출력하는 단계
		for(int i = 1; i <= n; i++)
		{
			consumption = Integer.parseInt(br.readLine());
			
			if(consumption <= 1000)
				charge = firstUsage * consumption;
			else
			{
				charge = firstUsage * 1000;
				charge += addUsage * (consumption - 1000);
			}
			
			bw.write(String.valueOf(consumption) + " ");
			bw.write(String.valueOf(charge) + "\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}