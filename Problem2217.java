package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem2217 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		int[] maxArr = new int[N];
		
		// 로프들에 대한 정보를 받는 단계
		for(int i = 0; i < N; i++)
		{
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		// 입력받은 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량을 구하는 단계
		Arrays.sort(numArr);
		
		for(int i = 0; i < N; i++)
		{
			maxArr[i] = numArr[i]*(numArr.length-i);
		}
		
		Arrays.sort(maxArr);
		
		// 출력하는 단계
		bw.write(String.valueOf(maxArr[maxArr.length-1]));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}