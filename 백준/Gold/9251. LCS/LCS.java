import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] first = br.readLine().toCharArray();
        char[] second = br.readLine().toCharArray();
        
        int n = first.length;
        int m = second.length;
        
        int[][] dp = new int[n + 1][m + 1]; // DP 배열 초기화
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (first[i - 1] == second[j - 1]) { // 문자가 같다면
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else { // 문자가 다르다면
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        System.out.println(dp[n][m]); // 최장 공통 부분 수열의 길이 출력
    }
}
