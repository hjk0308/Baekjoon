package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2748 {
	
	public static long fibonacci(long a, long b, int c)
	{
		if(c == 0)
			return b;
		else
			return fibonacci(b, a+b, c-1);
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		if(n == 0)
			bw.write("0");
		else if(n == 1)
			bw.write("1");
		else
		{
			bw.write(String.valueOf(fibonacci(1, 1, n-2)));
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}