import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String commands = br.readLine();  // 명령어
            int n = Integer.parseInt(br.readLine()); // 배열 크기
            String input = br.readLine(); // 배열 값

            // 배열 파싱
            Deque<Integer> deque = new ArrayDeque<>();
            input = input.substring(1, input.length() - 1); // '['와 ']' 제거
            if (!input.isEmpty()) { // 빈 배열이 아닌 경우
                String[] numbers = input.split(",");
                for (String num : numbers) {
                    deque.add(Integer.parseInt(num.trim()));
                }
            }

            boolean isReversed = false;
            boolean isError = false;

            // 명령어 실행
            for (char cmd : commands.toCharArray()) {
                if (cmd == 'R') {
                    isReversed = !isReversed;
                } else if (cmd == 'D') {
                    if (deque.isEmpty()) {
                        isError = true;
                        break;
                    }
                    if (isReversed) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            // 결과 저장
            if (isError) {
                sb.append("error\n");
            } else {
                sb.append("[");
                while (!deque.isEmpty()) {
                    if (isReversed) {
                        sb.append(deque.pollLast());
                    } else {
                        sb.append(deque.pollFirst());
                    }
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]\n");
            }
        }

        System.out.print(sb);
    }
}
