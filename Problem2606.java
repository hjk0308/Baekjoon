package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem2606 {
	
	static int n;
	static int p;
	static int time = 1; 
	static boolean[] visited;
	static int[] pre;
	static int[] post;
	static int[] parent;
	static int[][] G;
	
	public static void DFS(int a)
	{
		visited[a] = true;
		pre[a] = time;
		time += 1;
		
		for(int i = 0; i < n; i++)
		{
			if(G[a][i] == 1)
			{
				if(visited[i] == false)
				{
					parent[i] = a;
					DFS(i);
				}
			}
		}
		
		post[a] = time;
		time += 1;
	}
	
	public static void DFSOne(int start)
	{
		for(int i = 0; i < n; i++)
		{
			visited[i] = false;
		}
		
		DFS(start);
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = null;
		n = Integer.parseInt(br.readLine());  // 컴퓨터의 수 n
		p = Integer.parseInt(br.readLine());  // 컴퓨터 쌍의 수 p
		int count = 0;  // 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수
		int s, e;  
		visited = new boolean[n];  // 노드를 방문했는지 기록하기 위한 배열
		pre = new int[n];  // pre 시간 기록하기 위한 배열
		post = new int[n];  // post 시간 기록하기 위한 배열
		parent = new int[n];  // 노드의 부모 노드를 기록하기 위한 배열
 		G = new int[n][n];  // 인접 행렬을 표현하기 위한 배열
 		
 		// 인접 행렬 0으로 초기화
 		for(int i = 0; i < n; i++)
 		{
 			for(int j = 0; j < n; j++)
 	 		{
 	 			G[i][j] = 0;
 	 		}
 		}
		
		for(int i = 1; i <= p; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			s = Integer.parseInt(st.nextToken())-1;
			e = Integer.parseInt(st.nextToken())-1;
			
			G[s][e] = 1;
			G[e][s] = 1;
		}
		
		// 1번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수를 세는 단계
		DFSOne(0);
		
		for(int i = 0; i < n; i++)
		{			
			if(visited[i] == true)
				count += 1;
		}
		
		count -= 1;  // 1번 컴퓨터 제외
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}