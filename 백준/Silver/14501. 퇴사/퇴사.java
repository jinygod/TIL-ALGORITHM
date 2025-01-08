import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 총 상담 일수
        int[] time = new int[N + 1]; // 상담 기간
        int[] price = new int[N + 1]; // 상담 수익
        int[] dp = new int[N + 2]; // dp 배열: N+1일까지의 최대 수익 저장

        // 입력 처리
        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            time[i] = Integer.parseInt(st.nextToken());
            price[i] = Integer.parseInt(st.nextToken());
        }

        // DP 계산
        for (int i = 1; i <= N; i++) {
            // 현재 날짜의 최대 수익을 다음 날로 넘김 (상담하지 않는 경우)
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

            // 상담이 퇴사일을 넘지 않는 경우
            if (i + time[i] <= N + 1) {
                dp[i + time[i]] = Math.max(dp[i + time[i]], dp[i] + price[i]);
            }
        }

        // 최종 결과 출력
        System.out.println(dp[N + 1]);
    }
}
