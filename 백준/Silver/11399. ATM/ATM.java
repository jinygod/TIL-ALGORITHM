import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] minute = new int[N];

        // 입력받기
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            minute[i] = Integer.parseInt(inputs[i]);
        }

        // 오름차순 정렬
        Arrays.sort(minute);

        int total = 0;     // 현재까지의 누적 시간
        int realTotal = 0; // 전체 대기 시간의 합

        // 누적 합 계산
        for (int i = 0; i < N; i++) {
            total += minute[i];
            realTotal += total;
        }

        // 결과 출력
        bw.write(String.valueOf(realTotal) + "\n"); // 정수를 문자열로 변환
        bw.flush();

        br.close();
        bw.close();
    }
}
