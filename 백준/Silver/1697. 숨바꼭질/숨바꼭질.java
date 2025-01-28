import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 입력 처리
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 수빈이의 위치
        int K = Integer.parseInt(input[1]); // 동생의 위치
        
        // BFS 수행
        System.out.println(bfs(N, K));
    }
    
    public static int bfs(int start, int target) {
        // 방문 체크 배열 및 큐 초기화
        boolean[] visited = new boolean[100001];
        Queue<int[]> queue = new LinkedList<>();
        
        // 시작 위치 삽입 (위치, 시간)
        queue.add(new int[]{start, 0});
        visited[start] = true;
        
        // BFS 탐색
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int position = current[0];
            int time = current[1];
            
            // 동생의 위치에 도달하면 현재 시간 반환
            if (position == target) {
                return time;
            }
            
            // 다음 가능한 위치 탐색
            int[] nextPositions = {position - 1, position + 1, position * 2};
            for (int next : nextPositions) {
                // 유효 범위 내에서 아직 방문하지 않은 위치만 탐색
                if (next >= 0 && next <= 100000 && !visited[next]) {
                    queue.add(new int[]{next, time + 1});
                    visited[next] = true; // 방문 체크
                }
            }
        }
        
        return -1; // 탐색 실패 (이론적으로는 발생하지 않음)
    }
}
