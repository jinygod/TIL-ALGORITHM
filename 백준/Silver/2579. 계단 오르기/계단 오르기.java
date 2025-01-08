import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N + 1]; // 계단 점수
        int[] dp = new int[N + 1]; // 최대 점수 DP 배열

        // 계단 점수 입력
        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }

        // 초기값 설정
        dp[1] = stairs[1];
        if (N >= 2) dp[2] = stairs[1] + stairs[2];

        // 점화식
        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]) + stairs[i];
        }

        // 결과 출력
        System.out.println(dp[N]);
    }
}
