package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;

public class Problem15720 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] BCD = new int[3];
		
		for(int i = 0; i < 3; i++)
		{
			BCD[i] = Integer.parseInt(st.nextToken());
		}
		
		Integer[] arrB = new Integer[BCD[0]];
		Integer[] arrC = new Integer[BCD[1]];
		Integer[] arrD = new Integer[BCD[2]];
		
		Arrays.sort(BCD);
		int set = BCD[0];  // 세트 개수
		int beforePrice = 0;  // 할인 전 가격
		
		// 버거 가격 입력받는 단계
		int idx = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens() == true)
		{
			arrB[idx] = Integer.parseInt(st.nextToken());
			beforePrice += arrB[idx];
			idx += 1;
		}
		
		// 사이드 메뉴 가격 입력받는 단계
		idx = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens() == true)
		{
			arrC[idx] = Integer.parseInt(st.nextToken());
			beforePrice += arrC[idx];
			idx += 1;
		}
		
		// 음료 가격 입력받는 단계
		idx = 0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens() == true)
		{
			arrD[idx] = Integer.parseInt(st.nextToken());
			beforePrice += arrD[idx];
			idx += 1;
		}
		
		// 세트 할인이 적용된 후의 최소 가격을 구하는 단계
		Arrays.sort(arrB, Collections.reverseOrder());
		Arrays.sort(arrC, Collections.reverseOrder());
		Arrays.sort(arrD, Collections.reverseOrder());
		
		int afterPrice = 0;  // 할인 후 최소 가격
		
		for(int i = 0; i < set; i++)
		{
			arrB[i] = arrB[i] / 100 * 90;
			arrC[i] = arrC[i] / 100 * 90;
			arrD[i] = arrD[i] / 100 * 90;
		}
		
		for(int i = 0; i < arrB.length; i++)
		{
			afterPrice += arrB[i];
		}
		
		for(int i = 0; i < arrC.length; i++)
		{
			afterPrice += arrC[i];
		}
		
		for(int i = 0; i < arrD.length; i++)
		{
			afterPrice += arrD[i];
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(beforePrice));
		bw.newLine();
		bw.write(String.valueOf(afterPrice));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}