package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Problem1009 {
	
	public static BigInteger calc(int a, int b)
	{
		BigInteger result = new BigInteger("1");
		BigInteger mul = new BigInteger(""+a);
		BigInteger rem = new BigInteger(""+10);
		
		for(int i = 0; i < b; i++)
		{
			result = result.multiply(mul);
		}
		
		result = result.remainder(rem);
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
	
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++)
		{
			st = new StringTokenizer(br.readLine());
			bw.write(String.valueOf(calc(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))));
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}


