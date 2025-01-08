import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 물건 개수
        int K = Integer.parseInt(st.nextToken()); // 배낭 최대 용량

        int[] weight = new int[N + 1]; // 물건의 무게
        int[] value = new int[N + 1];  // 물건의 가치
        int[][] dp = new int[N + 1][K + 1]; // DP 테이블

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        // DP 배열 채우기
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                if (weight[i] > j) { // 물건을 넣을 수 없는 경우
                    dp[i][j] = dp[i-1][j];
                } else { // 물건을 넣을 수 있는 경우
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - weight[i]] + value[i]);
                }
            }
        }

        // 최적해 출력
        System.out.println(dp[N][K]);
    }
}
