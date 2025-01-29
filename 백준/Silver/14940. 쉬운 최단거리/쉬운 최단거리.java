import java.util.*;
import java.io.*;

public class Main {
    public static int[] dx = {-1, 1, 0, 0}; // 상, 하, 좌, 우
    public static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 행 개수
        int m = Integer.parseInt(st.nextToken()); // 열 개수
        int[][] map = new int[n][m];
        int[][] result = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        Queue<int[]> queue = new LinkedList<>();

        // 입력 받기
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                result[i][j] = -1; // 기본적으로 모든 위치를 -1로 설정

                // 목표 지점(2)에서 BFS 시작
                if (map[i][j] == 2) {
                    queue.add(new int[]{i, j});
                    result[i][j] = 0; // 시작점은 거리 0
                    visited[i][j] = true;
                }
            }
        }

        // BFS 탐색 시작
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // 유효한 범위 내에 있고, 방문하지 않았으며, 갈 수 있는 땅(1)일 경우
                if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny] && map[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny});
                    visited[nx][ny] = true;
                    result[nx][ny] = result[x][y] + 1; // 최단 거리 갱신
                }
            }
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    sb.append(0).append(" "); // 원래 갈 수 없는 곳이면 0 유지
                } else {
                    sb.append(result[i][j]).append(" "); // BFS 결과 적용
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
