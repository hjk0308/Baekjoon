package github;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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

public class Problem10773 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Stack stack = new Stack();
		
		int k = Integer.parseInt(br.readLine());
		int sum = 0;
		int n = -1;
		
		for(int i = 0; i < k; i++)
		{
			n = Integer.parseInt(br.readLine());
			
			if(n == 0)
			{
				if(stack.empty() == 1)
				{
					stack.push(n);
				}
				else
				{
					stack.pop();
				}
			}
			else
			{
				stack.push(n);
			}
		}
		
		while(stack.empty() != 1)
		{
			sum += stack.pop();
		}
		
		bw.write(String.valueOf(sum));
		bw.newLine();
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}