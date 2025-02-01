import java.util.*;
import java.io.*;

public class Main {
    static int[] dp = new int[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // 1. 초기값 설정
        dp[1] = 1;
        dp[2] = 3;

        // 2. 점화식 적용 (dp[n] = dp[n-1] + 2 * dp[n-2])
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;
        }

        System.out.println(dp[n]);
    }
}
