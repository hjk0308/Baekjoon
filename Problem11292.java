package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11292 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = -1;  // 각 테스트 케이스의 학생 수
		double max = -1;  // 각 테스트 케이스의 가장 큰 키
		String[] name = new String[50];  // 각 테스트 케이스의 학생 이름
		double[] height = new double[50];  // 각 테스트 케이스의 학생 키
		StringTokenizer st = null;
		
		// 각 테스트 케이스마다 입력받아서 가장 키가 큰 학생들의 이름을 알아내는 단계
		while((N = Integer.parseInt(br.readLine())) != 0)
		{
			// 학생들의 이름과 키를 입력받아서 각 배열에 저장하는 단계
			for(int i = 0; i < N; i++)
			{
				st = new StringTokenizer(br.readLine());
				
				name[i] = st.nextToken();
				height[i] = Double.parseDouble(st.nextToken());
			}
			
			// 가장 큰 키를 찾는 단계
			max = height[0];
			for(int i = 1; i < N; i++)
			{
				if(max < height[i])
					max = height[i];
			}
			
			// 가장 키가 큰 학생들의 이름을 입력받은 순서대로 출력하는 단계 
			for(int i = 0; i < N; i++)
			{
				if(max == height[i])
					bw.write(name[i] + " ");
			}
			
			bw.newLine();
		}
		
		// 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}