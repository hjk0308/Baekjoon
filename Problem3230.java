package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class Problem3230 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		List<Integer> list1 = new ArrayList<>();  // 첫 번째 경주 순위를 저장할 리스트
		List<Integer> list2 = new ArrayList<>();  // 두 번째 경주 순위를 저장할 리스트
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());  
		int M = Integer.parseInt(st.nextToken());
		int rank;  // 순위
		
		// 첫 번째 경주 순위 계산
		for(int i = 1; i <= N; i++)
		{
			rank = Integer.parseInt(br.readLine());
			list1.add(rank-1, i);
		}
		
		// 두 번째 경주 순위 계산
		for(int i = M-1; i >= 0; i--)
		{
			rank = Integer.parseInt(br.readLine());
			list2.add(rank-1, list1.get(i));
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(list2.get(0))+"\n");  // 금메달
		bw.write(String.valueOf(list2.get(1))+"\n");  // 은메달
		bw.write(String.valueOf(list2.get(2))+"\n");  // 동메달
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}