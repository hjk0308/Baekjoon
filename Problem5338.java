package github;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem5338 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 출력하는 단계
		bw.write("       _.-;;-._\n");
		bw.write("'-..-'|   ||   |\n");
		bw.write("'-..-'|_.-;;-._|\n");
		bw.write("'-..-'|   ||   |\n");
		bw.write("'-..-'|_.-''-._|\n");
		
		bw.flush();
		
		bw.close();
	}
}