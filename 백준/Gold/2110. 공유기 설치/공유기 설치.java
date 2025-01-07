import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력값 처리
        String[] input1 = br.readLine().split(" ");
        int N = Integer.parseInt(input1[0]);
        int C = Integer.parseInt(input1[1]);

        long[] location = new long[N];
        for (int i = 0; i < N; i++) {
            location[i] = Long.parseLong(br.readLine());
        }

        // 좌표 정렬
        Arrays.sort(location);

        // 이분 탐색 범위 설정
        long low = 1; // 최소 거리
        long high = location[N - 1] - location[0]; // 최대 거리
        long result = 0;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (canPlace(location, C, mid)) {
                result = mid; // 가능한 거리 갱신
                low = mid + 1; // 더 큰 거리 탐색
            } else {
                high = mid - 1; // 더 작은 거리 탐색
            }
        }

        System.out.println(result);
    }

    // 공유기를 mid 거리 이상으로 설치할 수 있는지 판단
    private static boolean canPlace(long[] location, int C, long mid) {
        int count = 1; // 첫 번째 집에 공유기 설치
        long lastPlaced = location[0]; // 마지막으로 설치한 집

        for (int i = 1; i < location.length; i++) {
            if (location[i] - lastPlaced >= mid) {
                count++; // 공유기 추가 설치
                lastPlaced = location[i]; // 현재 집에 설치
                if (count == C) return true; // 공유기 설치 완료
            }
        }

        return false; // 공유기를 모두 설치하지 못한 경우
    }
}
