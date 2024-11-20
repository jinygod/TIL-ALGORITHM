import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = sc.nextInt();
        }

        String answer = ""; // 결과 저장

        // 배열 검사
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < 7; i++) { // 인접한 요소만 비교
            if (arr[i] < arr[i + 1]) { // 오름차순 체크
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) { // 내림차순 체크
                isAscending = false;
            }
        }

        // 결과 판별
        if (isAscending) {
            answer = "ascending";
        } else if (isDescending) {
            answer = "descending";
        } else {
            answer = "mixed";
        }

        System.out.println(answer); // 결과 출력
    }
}
