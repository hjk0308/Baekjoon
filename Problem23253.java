package github;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Stack {
	
	List<Integer> items;
	
	Stack()
	{
		items = new ArrayList<>();
	}
	
	public void push(int v)
	{
		items.add(v);
	}
	
	public int pop()
	{
		if(items.size() == 0)
		{
			return -1;
		}
		else
		{
			int n = items.get(items.size()-1);
			items.remove(items.size()-1);
			return n;
		}
	}
	
	public int size()
	{
		return items.size();
	}
	
	public int empty()
	{
		if(items.isEmpty())
			return 1;
		else
			return 0;
	}
	
	public int top()
	{
		if(items.size() == 0)
			return -1;
	
		else
			return items.get(items.size()-1);
	}
}



public class Problem23253 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Stack[] stackArr = new Stack[m];
		
		// 스택을 이용하여 문제의 조건을 구성하는 단계
		for(int i = 0; i < m; i++)
		{
			stackArr[i] = new Stack();
			
			int k = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine());
			
			for(int j = 0; j < k; j++)
			{
				stackArr[i].push(Integer.parseInt(st.nextToken()));
			}
		}
		
		int c = 1;
		boolean bool;
		
		// 스택을 이용하여 문제를 푸는 단계
		while(c <= n)
		{
			bool = false;
			
			for(int i = 0; i < stackArr.length; i++)
			{
				if(stackArr[i].top() == c)
				{
					stackArr[i].pop();
					bool = true;
					break;
				}
			}
			
			if(bool != true)
			{
				bw.write(String.valueOf("No"));
				break;
			}
			
			c += 1;
		}
		
		if(c > n)
			bw.write(String.valueOf("Yes"));
		
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}