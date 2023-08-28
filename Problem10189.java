package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem10189 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 출력하는 단계
		bw.write("#  # #### #### #  #\n");
		bw.write("#### #  # #  # # #\n");
		bw.write("#### #  # #  # # #\n");
		bw.write("#  # #### #### #  #");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}