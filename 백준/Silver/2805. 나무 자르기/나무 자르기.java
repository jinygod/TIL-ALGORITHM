import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫 번째 줄 입력
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]); // 나무 개수
        int M = Integer.parseInt(input1[1]); // 필요한 나무 길이

        // 두 번째 줄 입력
        String[] input2 = br.readLine().split(" ");
        int[] height = new int[N];
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            height[i] = Integer.parseInt(input2[i]);
            maxHeight = Math.max(maxHeight, height[i]); // 나무의 최댓값 찾기
        }

        int low = 0; // 절단기의 최소 높이
        int high = maxHeight; // 절단기의 최대 높이
        int result = 0; // 결과 저장

        while (low <= high) {
            int mid = (low + high) / 2; // 중간값
            long tree = 0; // 잘린 나무의 총 길이 (long으로 설정)

            // 잘린 나무 길이 계산
            for (int i = 0; i < N; i++) {
                if (height[i] > mid) {
                    tree += height[i] - mid;
                }
            }

            if (tree >= M) { // 잘린 나무 길이가 충분한 경우
                result = mid; // 현재 절단기 높이를 저장
                low = mid + 1; // 더 높은 절단기 높이 탐색
            } else { // 잘린 나무 길이가 부족한 경우
                high = mid - 1; // 더 낮은 절단기 높이 탐색
            }
        }

        System.out.println(result);
        br.close();
    }
}
