package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Problem4153 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nums = new int[3];
		
		// 세 변의 길이를 입력받아서 직각 삼각형인지 구분하는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		while((nums[0] = Integer.parseInt(st.nextToken())) != 0)
		{
			nums[1] = Integer.parseInt(st.nextToken());
			nums[2] = Integer.parseInt(st.nextToken());
			
			// 오름차순으로 정렬
			Arrays.sort(nums);
			
			// 직각 삼각형인지 구분해서 결과 출력
			if(((nums[0]*nums[0])+(nums[1]*nums[1])) == (nums[2]*nums[2]))
				bw.write("right\n");
			else
				bw.write("wrong\n");
			
			st = new StringTokenizer(br.readLine());
		}
		
		// 전체 출력하는 단계
		bw.flush();
		
		br.close();
		bw.close();
	}
}