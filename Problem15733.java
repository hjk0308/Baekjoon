package github;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem15733 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 예제 출력과 같게 출력하는 단계
		bw.write("I'm Sexy");
		
		bw.flush();
		
		bw.close();
	}
}