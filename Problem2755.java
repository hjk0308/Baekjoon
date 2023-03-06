package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2755 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());  // 과목 개수 N
		String grade = null;
		double grades = 0;
		int point = -1;
		int points = 0;
		double aver = -1;
		
		// 평균 평점을 구하는 단계
		for(int i = 0; i < N; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			st.nextToken();  // 과목 날림
			
			point = Integer.parseInt(st.nextToken());
			points += point;
			
			grade = st.nextToken();
			
			if(grade.equals("A+") == true)
			{
				grades += (4.3*point);
			}
			else if(grade.equals("A0") == true)
			{
				grades += (4.0*point);
			}
			else if(grade.equals("A-") == true)
			{
				grades += (3.7*point);
			}
			else if(grade.equals("B+") == true)
			{
				grades += (3.3*point);
			}
			else if(grade.equals("B0") == true)
			{
				grades += (3.0*point);
			}
			else if(grade.equals("B-") == true)
			{
				grades += (2.7*point);
			}
			else if(grade.equals("C+") == true)
			{
				grades += (2.3*point);
			}
			else if(grade.equals("C0") == true)
			{
				grades += (2.0*point);
			}
			else if(grade.equals("C-") == true)
			{
				grades += (1.7*point);
			}
			else if(grade.equals("D+") == true)
			{
				grades += (1.3*point);
			}
			else if(grade.equals("D0") == true)
			{
				grades += (1.0*point);
			}
			else if(grade.equals("D-") == true)
			{
				grades += (0.7*point);
			}		
		}
		
		aver = grades / (double)points;
		
		// 출력하는 단계
		bw.write(String.format("%.2f", aver));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}