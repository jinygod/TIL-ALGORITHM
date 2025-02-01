import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] dp = new int[N + 1];

        // 초기값 설정
        for (int i = 1; i <= N; i++) {
            dp[i] = i; // 최악의 경우 (모든 숫자를 1^2로 채움)
            for (int j = 1; j * j <= i; j++) { // 가능한 모든 제곱수 확인
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        System.out.println(dp[N]);
    }
}
