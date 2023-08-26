package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem9654 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 주어진 예제대로 출력하는 단계
		bw.write("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n");
		bw.write("N2 Bomber      Heavy Fighter  Limited    21        \n");
		bw.write("J-Type 327     Light Combat   Unlimited  1         \n");
		bw.write("NX Cruiser     Medium Fighter Limited    18        \n");
		bw.write("N1 Starfighter Medium Fighter Unlimited  25        \n");
		bw.write("Royal Cruiser  Light Combat   Limited    4         ");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}