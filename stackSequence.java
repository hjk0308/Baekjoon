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

public class stackSequence {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int nArr[] = new int[n];  // 입력 받을 순열 배열
		
		int a = 0;  // 입력받은 숫자 개수
		int b = 1;  // stack에 넣을 수
		int t = -1; // 임시 temp
		
		String str = "";
		
		Stack stack = new Stack();
		
		for(int i = 0; i < n; i++)
		{
			nArr[i] = Integer.parseInt(br.readLine());
		}
		
		while(a < n)
		{
			
			if(b <= nArr[a])
			{
				stack.push(b);
				b += 1;
				str += "+\n";
			}
			else
			{
				t = stack.pop();
				if(t == nArr[a])
				{
					a += 1;
					str += "-\n";
				}
				else
				{
					str = "NO";
					break;
				}
			}
		}
		
		bw.write(str);
		bw.flush();
		
		br.close();
		bw.close();
	}
}
