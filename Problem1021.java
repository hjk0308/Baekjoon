package github;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class CircularQueue {
	
	List<Integer> items;
	
	CircularQueue()
	{
		items = new ArrayList<>();
	}
	
	public void push(int x)
	{
		items.add(x);
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
	
	public void left_move()
	{
		int n = items.get(0);
		items.remove(0);
		items.add(n);
	}
	
	public void right_move()
	{
		int n = items.get(items.size()-1);
		items.remove(items.size()-1);
		items.add(0, n);
	}
	
	public int calcMin(int x)
	{
		int lc = items.indexOf(x);
		int rc = items.size()-items.indexOf(x);
			
		if(lc <= rc)
		{
			while(front() != x)
			{
				left_move();
			}
			
			pop();
			
			return lc;
		}
		else
		{
			while(front() != x)
			{
				right_move();
			}
			
			pop();
			
			return rc;
		}
	}
}

public class Problem1021 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int minSum = 0;
		
		CircularQueue circularQueue = new CircularQueue();
		
		for(int i = 1; i <= n; i++)
		{
			circularQueue.push(i);
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= m; i++)
		{
			minSum += circularQueue.calcMin(Integer.parseInt(st.nextToken()));
		}
		
		bw.write(String.valueOf(minSum));
		bw.newLine();
		
		bw.flush();
		
		br.close();
		bw.close();
	}

}
