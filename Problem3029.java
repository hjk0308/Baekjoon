package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem3029 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int curH = -1, curM = -1, curS = -1, cSum = -1;  // 현재 시간 관련 변수
		int thrH = -1, thrM = -1, thrS = -1, tSum = -1;  // 나트륨 던질 시간 관련 변수
		int waitH = -1, waitM = -1, waitS = -1, wSum = -1;  // 기다려야 하는 시간 관련 변수
		StringTokenizer st = new StringTokenizer(br.readLine(), ":");
		
		curH = Integer.parseInt(st.nextToken());
		curM = Integer.parseInt(st.nextToken());
		curS = Integer.parseInt(st.nextToken());
		cSum = curH*60*60 + curM*60 + curS;
		
		st = new StringTokenizer(br.readLine(), ":");
		
		thrH = Integer.parseInt(st.nextToken());
		thrM = Integer.parseInt(st.nextToken());
		thrS = Integer.parseInt(st.nextToken());
		tSum = thrH*60*60 + thrM*60 + thrS;
		
		// 기다려야 하는 시간을 구하는 단계
		if((curH < thrH) || ((curH == thrH) && (curM < thrM)) ||
			((curH == thrH) && (curM == thrM) && (curS < thrS)))
		{
			wSum = tSum - cSum;
			
			waitH = wSum / 3600;
			wSum = wSum % 3600;
			
			waitM = wSum / 60;
			wSum = wSum % 60;
			
			waitS = wSum;
		}
		else
		{
			wSum = 24*3600 - (cSum - tSum);
			
			waitH = wSum / 3600;
			wSum = wSum % 3600;
			
			waitM = wSum / 60;
			wSum = wSum % 60;
			
			waitS = wSum;
		}
		
		// 출력하는 단계
		if(waitH <= 9)
			bw.write("0" + waitH);
		else
			bw.write(String.valueOf(waitH));
		
		bw.write(":");
		
		if(waitM <= 9)
			bw.write("0" + waitM);
		else
			bw.write(String.valueOf(waitM));
		
		bw.write(":");
		
		if(waitS <= 9)
			bw.write("0" + waitS);
		else
			bw.write(String.valueOf(waitS));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}