package github;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem15962 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 출력하는 단계
		bw.write("파이팅!!");
		
		bw.flush();
		
		bw.close();
	}
}