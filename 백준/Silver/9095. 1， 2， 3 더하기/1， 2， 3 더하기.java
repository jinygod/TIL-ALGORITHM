import java.util.*;
import java.io.*;

public class Main {
    
    public static int[] dp = new int[11];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[T]; // T개의 입력값을 저장
        
        // DP 테이블 초기화
        dp[1] = 1; // 1을 만드는 경우: {1}
        dp[2] = 2; // 2를 만드는 경우: {1+1, 2}
        dp[3] = 4; // 3을 만드는 경우: {1+1+1, 1+2, 2+1, 3}
        for (int i = 4; i < 11; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        
        // 입력값 처리
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        // 결과 출력
        for (int i = 0; i < T; i++) {
            System.out.println(dp[arr[i]]);
        }
    }
}
