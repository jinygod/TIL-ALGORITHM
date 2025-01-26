import java.util.*;
import java.io.*;

public class Main {
    public static int[][] dp = new int[41][2]; // Fibonacci 호출 횟수 저장

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int[] numArr = new int[T];
        for (int i = 0; i < T; i++) {
            numArr[i] = Integer.parseInt(br.readLine());
        }

        // 초기값 설정
        dp[0][0] = 1; // fibonacci(0): 0이 출력 1번
        dp[0][1] = 0; // fibonacci(0): 1이 출력 0번
        dp[1][0] = 0; // fibonacci(1): 0이 출력 0번
        dp[1][1] = 1; // fibonacci(1): 1이 출력 1번

        // DP 테이블 채우기
        for (int i = 2; i <= 40; i++) {
            dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
            dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
        }

        // 출력
        for (int i = 0; i < T; i++) {
            int num = numArr[i];
            System.out.println(dp[num][0] + " " + dp[num][1]);
        }
    }
}
