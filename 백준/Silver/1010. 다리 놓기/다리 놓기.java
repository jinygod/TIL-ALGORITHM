import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // 테스트 케이스 수
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // 서쪽 사이트 수
            int m = sc.nextInt(); // 동쪽 사이트 수

            System.out.println(combination(m, n)); // 조합 계산 후 출력
        }
    }

    // 조합 계산 함수
    public static long combination(int m, int n) {
        long result = 1;

        // 조합 계산: mCn = m! / (n! * (m-n)!)
        for (int i = 0; i < n; i++) {
            result *= (m - i); // 분자
            result /= (i + 1); // 분모
        }

        return result;
    }
}
