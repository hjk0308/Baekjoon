package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem5086 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = -1;
		int b = -1;
		
		// 각 테스트 케이스마다 입력받아서 첫 번째 숫자가 두 번째 숫자의 약수라면 factor를,
		// 배수라면 multiple을, 둘 다 아니면 neither를 출력
		StringTokenizer st = new StringTokenizer(br.readLine());
		while((a = Integer.parseInt(st.nextToken())) != 0)
		{
			b = Integer.parseInt(st.nextToken());
			
			if(a < b)
			{
				if((b%a) == 0)
					bw.write("factor\n");
				else
					bw.write("neither\n");
			}
			else  // a > b인 경우(두 수가 같은 경우 X)
			{
				if((a%b) == 0)
					bw.write("multiple\n");
				else
					bw.write("neither\n");
			}
				
			st = new StringTokenizer(br.readLine());
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}