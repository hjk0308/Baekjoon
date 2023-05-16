package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2985 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		// 원래 적어진 등식을 구하는 단계
		if((a+b) == c)
			bw.write(String.valueOf(a) + "+" + String.valueOf(b) + "=" + String.valueOf(c));
		else if((a-b) == c)
			bw.write(String.valueOf(a) + "-" + String.valueOf(b) + "=" + String.valueOf(c));
		else if((a*b) == c)
			bw.write(String.valueOf(a) + "*" + String.valueOf(b) + "=" + String.valueOf(c));
		else if((a/b) == c)
			bw.write(String.valueOf(a) + "/" + String.valueOf(b) + "=" + String.valueOf(c));
		else if(a == (b+c))
			bw.write(String.valueOf(a) + "=" + String.valueOf(b) + "+" + String.valueOf(c));
		else if(a == (b-c))
			bw.write(String.valueOf(a) + "=" + String.valueOf(b) + "-" + String.valueOf(c));
		else if(a == (b*c))
			bw.write(String.valueOf(a) + "=" + String.valueOf(b) + "*" + String.valueOf(c));
		else if(a == (b/c))
			bw.write(String.valueOf(a) + "=" + String.valueOf(b) + "/" + String.valueOf(c));
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}