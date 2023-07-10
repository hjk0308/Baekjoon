package github;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Problem5337 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// Welcome을 예제 출력처럼 출력하는 단계
		bw.write(".  .   .\n");
		bw.write("|  | _ | _. _ ._ _  _\n");
		bw.write("|/\\|(/.|(_.(_)[ | )(/.\n");
		
		bw.flush();
		
		bw.close();
	}
}