package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem25972 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int res = 0;
		int N = Integer.parseInt(br.readLine());
		int[][] xl = new int[N][2];  // 도미노의 x좌표와 길이 l을 저장하는 배열 -> xl[i][0]은 x좌표, xl[i][1]은 길이 l 
		StringTokenizer st = null;
		
		for(int i = 0; i < N; i++)
		{
			st = new StringTokenizer(br.readLine());
			xl[i][0] = Integer.parseInt(st.nextToken());
			xl[i][1] = Integer.parseInt(st.nextToken());
		}
		
		// 모든 도미노가 무너지기 위해 처음에 무너트려야 할 모미노의 최소한의 갯수를 구하는 단계
		Arrays.sort(xl, (obj1, obj2) -> {
			if(obj1[0] == obj2[0])
				return Integer.compare(obj1[1], obj2[1]);
			else
				return Integer.compare(obj1[0], obj2[0]);
		});
		
		res += 1;
		for(int i = 0; i < N-1; i++)
		{
			// 도미노의 x좌표 값과 길이 l을 더한 값이 다음 도미노의 x좌표에 미치지 못하는 경우
			if(xl[i][0]+xl[i][1] < xl[i+1][0])
				res += 1;
		}
	
		// 출력하는 단계
		bw.write(String.valueOf(res));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}