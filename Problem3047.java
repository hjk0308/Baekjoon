package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem3047 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int[] ABC = new int[3];  // 세 수를 저장하기 위한 배열
		StringTokenizer st = new StringTokenizer(br.readLine());
		String order = br.readLine();  // 주어진 순서
		char ch = '0';
		
		for(int i = 0; i < 3; i++)
		{
			ABC[i] = Integer.parseInt(st.nextToken());
		}
		
		// 주어진 조건에 맞게 오름차순 정렬
		Arrays.sort(ABC);  // ABC[0] = A, ABC[1] = B, ABC[2] = C
		
		// 주어진 출력 순서대로 출력하는 단계
		for(int i = 0; i < 3; i++)
		{
			ch = order.charAt(i);
			
			switch(ch) 
			{
				case 'A':
					bw.write(String.valueOf(ABC[0]) + " ");
					break;
				case 'B':
					bw.write(String.valueOf(ABC[1]) + " ");
					break;
				case 'C':
					bw.write(String.valueOf(ABC[2]) + " ");
					break;
			}
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}