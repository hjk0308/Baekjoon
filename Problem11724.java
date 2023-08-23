package github;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Problem11724 {
	
	static int N;
	static int M;
	static int count;
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
		
		for(int i = 0; i < N; i++)
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
	
	public static void DFSAll()
	{
		for(int i = 0; i < N; i++)
		{
			visited[i] = false;
		}
		
		for(int i = 0; i < N; i++)
		{
			if(visited[i] == false)
			{
				count += 1;
				DFS(i);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력받는 단계
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());  // 정점의 개수 N
		M = Integer.parseInt(st.nextToken());  // 간선의 개수 M
		count = 0;  // 연결 요소의 개수
		int s, e;  
		visited = new boolean[N];  // 노드를 방문했는지 기록하기 위한 배열
		pre = new int[N];  // pre 시간 기록하기 위한 배열
		post = new int[N];  // post 시간 기록하기 위한 배열
		parent = new int[N];  // 노드의 부모 노드를 기록하기 위한 배열
 		G = new int[N][N];  // 인접 행렬을 표현하기 위한 배열
 		
 		// 인접 행렬 0으로 초기화
 		for(int i = 0; i < N; i++)
 		{
 			for(int j = 0; j < N; j++)
 	 		{
 	 			G[i][j] = 0;
 	 		}
 		}
		
		for(int i = 1; i <= M; i++)
		{
			st = new StringTokenizer(br.readLine());
			
			s = Integer.parseInt(st.nextToken())-1;
			e = Integer.parseInt(st.nextToken())-1;
			
			G[s][e] = 1;
			G[e][s] = 1;
		}
		
		// 연결 요소의 개수를 세는 단계
		DFSAll();
		
		// 출력하는 단계
		bw.write(String.valueOf(count));
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}