package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Problem5576 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] W = new int[10];  // W 대학 참가자들의 점수를 저장하기 위한 배열
		int[] K = new int[10];  // K 대학 참가자들의 점수를 저장하기 위한 배열
		int WScore = 0;  // W 대학의 점수
		int KScore = 0;  // K 대학의 점수
		
		// W 대학 참가자들의 점수
		for(int i = 0; i < 10; i++)
		{
			W[i] = Integer.parseInt(br.readLine());
		}
		
		// K 대학 참가자들의 점수
		for(int i = 0; i < 10; i++)
		{
			K[i] = Integer.parseInt(br.readLine());
		}
		
		// W 대학의 점수와 K 대학의 점수를 구하는 단계
		Arrays.sort(W);
		WScore = W[7] + W[8] + W[9];
		
		Arrays.sort(K);
		KScore = K[7] + K[8] + K[9];
		
		// 출력하는 단계
		bw.write(String.valueOf(WScore) + " " + String.valueOf(KScore));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}