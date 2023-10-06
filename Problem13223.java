package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem13223 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer time1 = new StringTokenizer(br.readLine(), ":");  // 현재 시각
		StringTokenizer time2 = new StringTokenizer(br.readLine(), ":");  // 소금 투하의 시간
		int secTime1 = 0;  // 초로 바꾼 현재 시각
		int secTime2 = 0;  // 초로 바꾼 소금 투하의 시간
		int resultSecTime;  // 초로 바꾼 로봇팔이 소금을 투하할 때까지 필요한 시간
		int temp;  // 임시 저장 변수
		String result = "";  // 로봇팔이 소금을 투하할 때까지 필요한 시간
		
		// 로봇팔이 소금을 투하할 때까지 필요한 시간을 계산하는 단계
		secTime1 += Integer.parseInt(time1.nextToken()) * 60 * 60;
		secTime1 += Integer.parseInt(time1.nextToken()) * 60;
		secTime1 += Integer.parseInt(time1.nextToken());
		
		secTime2 += Integer.parseInt(time2.nextToken()) * 60 * 60;
		secTime2 += Integer.parseInt(time2.nextToken()) * 60;
		secTime2 += Integer.parseInt(time2.nextToken());
		
		if(secTime1 < secTime2)
			resultSecTime = secTime2 - secTime1;
		else if(secTime1 > secTime2)
			resultSecTime = 24 * 60 * 60 - (secTime1 - secTime2);
		else  // secTime1 == secTime2
			resultSecTime = 24 * 60 * 60;
		
		// 시를 구함
		temp = resultSecTime / 3600;
		
		if(temp < 10)
			result += "0" + temp + ":";
		else
			result += temp + ":";
		
		// 분을 구함
		temp = resultSecTime % 3600;
		temp = temp / 60;
		
		if(temp < 10)
			result += "0" + temp + ":";
		else
			result += temp + ":";
		
		// 초를 구함
		temp = resultSecTime % 60;
		
		if(temp < 10)
			result += "0" + temp;
		else
			result += temp;
		
		// 출력하는 단계
		bw.write(result);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}