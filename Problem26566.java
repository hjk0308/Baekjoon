package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem26566 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int n = Integer.parseInt(br.readLine());
		double A1, P1, R1, P2;
		
		for(int i = 1; i <= n; i++)
		{
			st = new StringTokenizer(br.readLine());
			A1 = Double.parseDouble(st.nextToken());
			P1 = Double.parseDouble(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			R1 = Double.parseDouble(st.nextToken());
			P2 = Double.parseDouble(st.nextToken());
			
			if((A1 / P1) > (R1 * R1 * 3.14 / P2))
				bw.write("Slice of pizza\n");
			else
				bw.write("Whole pizza\n");
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}