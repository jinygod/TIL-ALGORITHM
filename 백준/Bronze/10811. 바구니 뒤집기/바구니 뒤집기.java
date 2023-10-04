import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 바구니의 개수
        int[] baskets = new int[N];

        // 초기 바구니 순서 설정
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        int M = Integer.parseInt(st.nextToken()); // 작업 횟수

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()); // 역순으로 만들 범위 시작
            int end = Integer.parseInt(st.nextToken());   // 역순으로 만들 범위 끝

            // 역순으로 만들 범위 내의 바구니 순서를 역순으로 변경
            reverseBaskets(baskets, start, end);
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            System.out.print(baskets[i] + " ");
        }
    }

    // 배열 내의 일부 원소를 역순으로 만드는 메서드
    private static void reverseBaskets(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start - 1];
            arr[start - 1] = arr[end - 1];
            arr[end - 1] = temp;
            start++;
            end--;
        }
    }
}
