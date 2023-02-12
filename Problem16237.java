package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem16237 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		int res = 0;
		int[] count = new int[5]; 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 5; i++)
		{
			count[i] = Integer.parseInt(st.nextToken());
		}
		
		// 모든 물건을 담는데 필요한 바구니 개수의 최솟값을 구하는 단계
		res += count[4];  // 5kg 물건을 담는데 필요한 바구니의 개수를 더함
		res += count[3];  // 4kg 물건을 담는데 필요한 바구니의 개수를 더함
		
		// 최대 5kg을 담을 수 있는 바구니에 4kg 물건을 담은 바구니들에 1kg 물건을 최대한 담음 
		if(count[0] >= count[3])
			count[0] -= count[3];
		else
			count[0] = 0;
		
		res += count[2];  // 3kg 물건을 담는데 필요한 바구니의 개수를 더함
		
		// 최대 5kg을 담을 수 있는 바구니에 3kg 물건을 담은 바구니들에 2kg 물건을 최대한 담음 
		if(count[1] >= count[2])
		{
			count[1] -= count[2];
			count[2] = 0;
		}
		else
		{
			count[2] -= count[1];
			count[1] = 0;
		}
		
		// 최대 5kg을 담을 수 있는 바구니에 3kg 물건을 담은 바구니들에 1kg 물건을 최대한 담음 
		if((count[0]/2) >= count[2])
			count[0] -= (count[2]*2);
		else
			count[0] = 0;
		
		res += (count[1]/2);  // 2kg 물건을 담는데 필요한 바구니의 개수를 더함
		
		// 최대 5kg을 담을 수 있는 바구니에 2kg 물건을 2개씩 담은 바구니들에 1kg 물건을 최대한 담음 
		if(count[0] >= (count[1]/2))
			count[0] -= (count[1]/2);
		else
		{
			count[1] -= ((count[1]/2)*2);
			count[0] = 0;
		}
		
		// 남은 2kg 물건을 1kg의 물건의 개수에 더하는 단계
		if((count[1] % 2) != 0)
			count[0] += 2;
		
		// 최대 5kg을 담을 수 있는 바구니에 1kg 물건을 최대한 담음 
		if((count[0] % 5) == 0)
			res += (count[0]/5);
		else
		{
			res += (count[0]/5);
			res += 1;
		}
	
		// 출력하는 단계
		bw.write(String.valueOf(res));
	
		bw.flush();
		
		br.close();
		bw.close();
	}
}