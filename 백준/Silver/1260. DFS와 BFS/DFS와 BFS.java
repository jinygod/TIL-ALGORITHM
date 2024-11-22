import java.util.*;

public class Main {
    static boolean[] visited;
    static ArrayList<Integer>[] graph;

    // DFS 함수
    public static void dfs(int node) {
        visited[node] = true;  // 현재 노드 방문 처리
        System.out.print(node + " ");  // 현재 노드 출력

        // 현재 노드와 연결된 모든 노드를 탐색
        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);  // 연결된 노드에 대해 DFS 재귀 호출
            }
        }
    }

    // BFS 함수
    public static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;  // 시작 노드 방문 처리
        queue.add(start);  // 큐에 시작 노드 추가

        while (!queue.isEmpty()) {
            int node = queue.poll();  // 큐에서 노드를 하나 꺼냄
            System.out.print(node + " ");  // 현재 노드 출력

            // 현재 노드와 연결된 모든 노드를 탐색
            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;  // 방문 처리
                    queue.add(next);  // 큐에 노드 추가
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  // 노드 수
        int M = sc.nextInt();  // 간선 수
        int startNode = sc.nextInt();  // 시작 노드

        // 그래프 초기화 (1번부터 N번까지 사용)
        graph = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 정보 입력 받기
        for (int i = 0; i < M; i++) {  // i = 0부터 시작
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);  // u와 v 연결
            graph[v].add(u);  // v와 u도 연결 (무방향 그래프)
        }

        // 각 노드의 연결 리스트를 오름차순으로 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]);
        }
        
        // 방문 여부 배열 초기화 (DFS와 BFS에서 모두 사용)
        visited = new boolean[N + 1];

        // DFS 수행
        dfs(startNode);
        System.out.println();  // DFS 출력 후 줄바꿈

        // 방문 여부 배열 초기화 (DFS 후 사용)
        Arrays.fill(visited, false);  // 다시 초기화

        // BFS 수행
        bfs(startNode);
    }
}
