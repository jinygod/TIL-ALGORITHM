import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값 처리
        String[] input1 = br.readLine().split(" ");
        int K = Integer.parseInt(input1[0]);
        int N = Integer.parseInt(input1[1]);

        int[] kLength = new int[K];
        long maxLength = 0; // 최댓값은 long으로 선언

        for (int i = 0; i < K; i++) {
            kLength[i] = Integer.parseInt(br.readLine());
            maxLength = Math.max(maxLength, kLength[i]); // 최댓값 갱신
        }

        long low = 1; // 최소 길이
        long high = maxLength; // 최대 길이
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2; // 중간값
            long share = 0;

            // 몫의 합 계산
            for (int i = 0; i < K; i++) {
                share += kLength[i] / mid;
            }

            if (share >= N) { // N개 이상 만들 수 있는 경우
                result = mid; // 최대 길이 저장
                low = mid + 1; // 더 긴 길이 탐색
            } else {
                high = mid - 1; // 더 짧은 길이 탐색
            }
        }

        // 결과 출력
        System.out.println(result);
    }
}
