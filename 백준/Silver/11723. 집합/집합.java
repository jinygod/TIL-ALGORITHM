import java.io.*;

public class Main {
    static int S = 0; // 비트마스크를 저장하는 변수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            String[] order = br.readLine().split(" ");
            String cmd = order[0]; // 명령어
            int x = 0;

            if (order.length > 1) { // x가 있는 명령어
                x = Integer.parseInt(order[1]);
            }

            switch (cmd) {
                case "add":
                    S |= (1 << x); // x번째 비트를 1로 설정
                    break;

                case "remove":
                    S &= ~(1 << x); // x번째 비트를 0으로 설정
                    break;

                case "check":
                    sb.append((S & (1 << x)) > 0 ? 1 : 0).append("\n"); // x번째 비트 확인
                    break;

                case "toggle":
                    S ^= (1 << x); // x번째 비트를 반전
                    break;

                case "all":
                    S = (1 << 21) - 1; // 모든 비트를 1로 설정 (1~20)
                    break;

                case "empty":
                    S = 0; // 모든 비트를 0으로 설정
                    break;
            }
        }

        System.out.print(sb); // 결과 출력
    }
}
