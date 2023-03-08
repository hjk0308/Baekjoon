package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem1924 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int sum = 0;
		
		// x월 y일이 무슨 요일인지 구하는 단계
		for(int i = 0; i < x-1; i++)
		{
			sum += months[i];
		}
		
		sum += y;
		sum %= 7;
		
		if(sum == 0)
			bw.write("SUN");
		else if(sum == 1)
			bw.write("MON");
		else if(sum == 2)
			bw.write("TUE");
		else if(sum == 3)
			bw.write("WED");
		else if(sum == 4)
			bw.write("THU");
		else if(sum == 5)
			bw.write("FRI");
		else if(sum == 6)
			bw.write("SAT");
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}