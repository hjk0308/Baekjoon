package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem14581 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		String id = br.readLine();  // 홍준의 아이디
		
		// 출력하는 단계
		bw.write(":fan::fan::fan:\n");
		bw.write(":fan::" + id + "::fan:\n");
		bw.write(":fan::fan::fan:");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}