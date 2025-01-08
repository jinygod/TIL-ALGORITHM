import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[] arr;
    static boolean[] visited;
    static List<Integer> result = new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer NM = new StringTokenizer(br.readLine());
        N = Integer.parseInt(NM.nextToken());
        M = Integer.parseInt(NM.nextToken());
        
        arr = new int[N];
        visited = new boolean[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr); // 사전순 출력을 위해 정렬
        dfs(0);
    }
    
    static void dfs(int depth) {
        if (depth == M) {
            // 결과 출력
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true; // 방문 처리
                result.add(arr[i]); // 선택한 숫자 추가
                dfs(depth + 1); // 다음 깊이 탐색
                result.remove(result.size() - 1); // 선택한 숫자 제거
                visited[i] = false; // 방문 취소
            }
        }
    }
}
