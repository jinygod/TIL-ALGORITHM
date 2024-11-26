import java.util.*;

public class Main{
    
    public static int makeOne(int n) {
        // dp 배열 선언: dp[i]는 i를 1로 만들기 위한 최소 연산 횟수
        int[] dp = new int[n + 1];

        // 초기화
        dp[1] = 0;  // 1은 이미 1이므로 연산 횟수 0

        // dp 배열을 채워나감
        for (int i = 2; i <= n; i++) {
            // 기본적으로 1을 빼는 연산을 먼저 고려
            dp[i] = dp[i - 1] + 1;

            // i가 2로 나누어지면 나누는 연산을 고려
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // i가 3으로 나누어지면 나누는 연산을 고려
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        // n을 1로 만드는 최소 연산 횟수 반환
        return dp[n];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.print(makeOne(n));
    }
}