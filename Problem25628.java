package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem25628 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());  // 햄버거 빵의 개수 
		int B = Integer.parseInt(st.nextToken());  // 햄버거 패티 개수
		int count = 0;  // 만들 수 있는 햄버거의 최대 개수
		
		// 만들 수 있는 햄버거의 최대 개수를 구하는 단계
		while((A >= 2) && (B >= 1))
		{
			A -= 2;
			B -= 1;
			
			count += 1;
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}