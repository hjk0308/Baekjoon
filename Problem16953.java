package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem16953 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String num;  
		int res = 0;  // 결과값
		boolean bool = false;  // 만들 수 있는지에 대한 유무
		
		// 정수 A와 B를 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		// 정수 A를 양의 정수 B로 만들기 위해 필요한 최소 연산 횟수를 구하는 단계
		while(true)
		{
			num = String.valueOf(B);
			if((num.charAt(num.length()-1) == '1') && (B > 10))
			{
				B = Integer.parseInt(num.substring(0, num.length()-1));
				res += 1;
				
				if(B == A)
				{
					bool = true;
					break;
				}
			}
			else if((B%2 == 0) && (B/2 >= A))
			{
				B /= 2;
				res += 1;
				
				if(B == A)
				{
					bool = true;
					break;
				}
			}
			else
			{
				if(B == A)
					bool = true;
					
				break;
			}
		}
		
		// 출력하는 단계
		if(bool == true)
			bw.write(String.valueOf(res+1));
		else
			bw.write("-1");
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}