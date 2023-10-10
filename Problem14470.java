package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem14470 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int A = Integer.parseInt(br.readLine());  // 원래 고기의 온도 A
		int B = Integer.parseInt(br.readLine());  // 목표 온도 B
		// 얼어 있는 고기를 1도 데우는 데 걸리는 시간 C
		int C = Integer.parseInt(br.readLine());  
		// 얼어 있는 고기를 해동하는 데 걸리는 시간 D
		int D = Integer.parseInt(br.readLine());
		// 얼어 있지 않은 고기를 1도 데우는 데 걸리는 시간 E
		int E = Integer.parseInt(br.readLine());
		int time = 0;  // A도의 고기를 B도로 데우는 데 걸리는 시간 (초 단위)
		
		// A도의 고기를 B도로 데우는 데 걸리는 시간을 초 단위로 구하는 단계
		if(A < 0)  // 고기의 얼어 있으면서 처음 온도가 0도 미만인 경우
		{
			time += (Math.abs(A) * C + D);  // 고기를 0도까지 데우고, 해동하는 데 걸리는 시간 
			time += (B * E);  // 얼어있지 않은 고기를 목표 온도까지 데우는 데 걸리는 시간
		}
		else  // A > 0, A == 0인 경우는 없음, 고기의 처음 온도가 1도 이상인 경우
			time += ((B - A) * E);  // 얼어있지 않은 고기를 목표 온도까지 데우는 데 걸리는 시간
		
		// 출력하는 단계
		bw.write(String.valueOf(time));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}