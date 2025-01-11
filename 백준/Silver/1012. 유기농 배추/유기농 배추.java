import java.util.*;
import java.io.*;

public class Main {
    static boolean[][] visited; // 방문 여부 배열
    static int[][] graph;       // 배추가 심어진 위치
    static int worms = 0;       // 지렁이 수
    static int[] dx = {-1, 1, 0, 0}; // 상하좌우 이동
    static int[] dy = {0, 0, -1, 1};

    // DFS 구현
    public static void dfs(int x, int y, int M, int N) {
        visited[x][y] = true; // 현재 위치 방문 처리

        // 상하좌우 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 범위를 벗어나지 않고, 배추가 있으며 방문하지 않은 곳
            if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
                if (graph[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny, M, N);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        while (T-- > 0) {
            String[] input = br.readLine().split(" ");
            int M = Integer.parseInt(input[0]); // 가로 길이
            int N = Integer.parseInt(input[1]); // 세로 길이
            int K = Integer.parseInt(input[2]); // 배추 개수

            graph = new int[M][N];
            visited = new boolean[M][N];

            for (int i = 0; i < K; i++) {
                String[] coords = br.readLine().split(" ");
                int x = Integer.parseInt(coords[0]);
                int y = Integer.parseInt(coords[1]);
                graph[x][y] = 1; // 배추 심기
            }

            worms = 0;

            // 모든 위치를 확인하며 DFS 호출
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][j] == 1 && !visited[i][j]) {
                        dfs(i, j, M, N); // 새로운 배추 묶음 발견
                        worms++;
                    }
                }
            }

            sb.append(worms).append("\n");
        }

        System.out.print(sb.toString());
        br.close();
    }
}
