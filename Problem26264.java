package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Problem26264 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int N = Integer.parseInt(br.readLine());  // 학생 수
		String s = br.readLine();  // 입력받은 문자열
		int security = 0;  // 정보보호 분야에 관심있는 학생 수
		int bigdata = 0;  // 빅데이터 분야에 관심있는 학생 수
		
		// 정보보호 분야와 빅데이터 분야 각각 관심있는 학생 수를 세는 단계
		s = s.replaceAll("security", "s");
		s = s.replaceAll("bigdata", "b");
		
		for(int i = 0; i < s.length(); i++)
		{
			if('s' == s.charAt(i))
				security += 1;
			else  // 'b' == s.charAt(i)
				bigdata += 1;
		}
		
		// 출력하는 단계
		if(security > bigdata)
			bw.write("security!");
		else if(security == bigdata)
			bw.write("bigdata? security!");
		else  // security < bigdata
			bw.write("bigdata?");
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}