package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem2857 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String fbi = "";
		String rcv = null;
		
		// 5개의 첩보원명을 입력받아서 FBI 요원인지 확인하는 단계
		for(int i = 1; i <= 5; i++)
		{
			rcv = br.readLine();
			
			if(rcv.contains("FBI"))
			{
				fbi += i;
			}
		}
		
		// 출력하는 단계
		if(fbi.length() != 0)
		{
			for(int i = 0; i < fbi.length(); i++)
			{
				bw.write(String.valueOf(fbi.charAt(i)) + " ");
			}
		}
		else
			bw.write("HE GOT AWAY!");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}