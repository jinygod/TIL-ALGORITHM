import java.util.*;

public class Main{
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    
    public static void dfs(int node){
        visited[node] = true;
        for(int next : graph[node]){
            if(!visited[next]){
                dfs(next);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        graph = new ArrayList[N + 1];
        for(int i = 1; i <= N; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < M; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }
        
        visited = new boolean[N + 1];
        
        int cc = 0;
        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                dfs(i);
                cc++;
            }
        }
        
        System.out.print(cc);
    }
}