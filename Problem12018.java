package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem12018 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] minMileage = new int[n];  // 각 과목들을 듣기 위해 필요한 최소 마일리지를 저장하기 위한 배열
		int p = -1;
		int l = -1;
		int[] mileage;  // 과목을 신청한 수강생들의 마일리지를 저장하기 위한 배열
		int res = 0;  
		
		// 마일리지로 최대로 들을 수 있는 과목 개수를 구하는 단계
		for(int i = 0; i < n; i++)
		{
			st = new StringTokenizer(br.readLine());
			p = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			
			if(p >= l)  // 수강인원 보다 신청한 사람의 수가 같거나 많은 경우
			{
				mileage = new int[p];
				
				for(int j = 0; j < p; j++)
				{
					mileage[j] = Integer.parseInt(st.nextToken());
				}
				
				Arrays.sort(mileage);
				minMileage[i] = mileage[p-l];
			}
			else  // 수강인원 보다 신청한 사람의 수가 적은 경우
			{
				minMileage[i] = 1;
			}
		}
		
		Arrays.sort(minMileage);
		
		for(int i = 0; i < n; i++)
		{
			if(m >= minMileage[i])
			{
				m -= minMileage[i];
				res += 1;
			}
			else
			{
				break;
			}
		}
		
		// 출력하는 단계
		bw.write(String.valueOf(res));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}