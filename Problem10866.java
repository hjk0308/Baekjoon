package github;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Dequeue {
	
	List<Integer> items;
	
	Dequeue()
	{
		items = new ArrayList<>();
	}
	
	public void push_front(int x)
	{
		items.add(0, x);
	}
	
	public void push_back(int x)
	{
		items.add(x);
	}
	
	public int pop_front()
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
	
	public int pop_back()
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

public class Problem10866 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
	
		int n = Integer.parseInt(br.readLine());
		String cmd = "";
		int x = 0;
		
		Dequeue dequeue = new Dequeue();
		
		for(int i = 0; i < n; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			cmd = st.nextToken();
			if(cmd.equals("push_front"))
			{
				x = Integer.parseInt(st.nextToken());
				dequeue.push_front(x);
			}
			else if(cmd.equals("push_back"))
			{
				x = Integer.parseInt(st.nextToken());
				dequeue.push_back(x);
			}
			else if(cmd.equals("pop_front"))
			{
				bw.write(String.valueOf(dequeue.pop_front()));
				bw.newLine();
				bw.flush();
			}
			else if(cmd.equals("pop_back"))
			{
				bw.write(String.valueOf(dequeue.pop_back()));
				bw.newLine();
				bw.flush();
			}
			else if(cmd.equals("size"))
			{
				bw.write(String.valueOf(dequeue.size()));
				bw.newLine();
				bw.flush();
			}
			else if(cmd.equals("empty"))
			{
				bw.write(String.valueOf(dequeue.empty()));
				bw.newLine();
				bw.flush();
			}
			else if(cmd.equals("front"))
			{
				bw.write(String.valueOf(dequeue.front()));
				bw.newLine();
				bw.flush();
			}
			else if(cmd.equals("back"))
			{
				bw.write(String.valueOf(dequeue.back()));
				bw.newLine();
				bw.flush();
			}
		}
		
		br.close();
		bw.close();
	}

}
