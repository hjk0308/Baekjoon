package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10102 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int V = Integer.parseInt(br.readLine());  // 심사위원의 수
		String R = br.readLine();  // 투표 결과 
		int A = 0;  // A가 받은 표
		int B = 0;  // B가 받은 표 
		
		// A와 B가 받은 표를 각각 세는 단계
		for(int i = 0; i < V; i++)
		{
			if(R.charAt(i) == 'A')
				A += 1;
			else if(R.charAt(i) == 'B')
				B += 1;
		}
		
		// 출력하는 단계
		if(A > B)
			bw.write("A");
		else if(A == B)
			bw.write("Tie");
		else  // A < B
			bw.write("B");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}