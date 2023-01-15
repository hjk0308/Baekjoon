package github;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Queue {
	
	List<Integer> items;
	
	Queue()
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
			int n = items.get(0);
			items.remove(0);
			return n;
		}
	}
	
	public int size()
	{
		return items.size();
	}
	
	public int empty()
	{
		if(items.size() == 0)
			return 1;
		else
			return 0;
	}
	
	public int front()
	{
		if(items.size() == 0)
			return -1;
		else
			return items.get(0);
	}
	
	public int back()
	{
		if(items.size() == 0)
			return -1;
		else
			return items.get(items.size()-1);
	}
}



public class Problem2161 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Queue queue = new Queue();
		
		// 1부터 n까지의 수를 Queue에 넣는 단계
		for(int i = 1; i <= n; i++)
		{
			queue.push(i);
		}
		
		// 마지막 카드가 남을 때까지 주어진 문제 조건을 반복하는 단계
		while(true)
		{
			if(queue.size() == 1)
				break;
			else
			{
				bw.write(String.valueOf(queue.pop() + " "));
				queue.push(queue.pop());
			}
		}
		
		bw.write(String.valueOf(queue.pop() + " "));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}
