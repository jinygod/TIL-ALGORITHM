import java.util.*;
import java.io.*;

public class Main{
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        
        graph = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            graph[start].add(end);
            graph[end].add(start);
        }
        
        for(int i = 1; i <= N; i++){
            Collections.sort(graph[i]);
        }
        
        
        visited = new boolean[N + 1];
        int count = 0;
        dfs(1);
        for(int i = 1; i <= N; i++){
            if(visited[i]){
                count++;
            }
        }
        System.out.print(count - 1);
    }
    
    public static void dfs(int node){
        visited[node] = true;
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
}