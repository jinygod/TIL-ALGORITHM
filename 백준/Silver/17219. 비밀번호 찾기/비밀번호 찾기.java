import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 출력 최적화

        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int M = Integer.parseInt(temp[1]);

        // HashMap 사용 (Key: 사이트 주소, Value: 비밀번호)
        HashMap<String, String> passwordMap = new HashMap<>();

        // N개의 사이트 & 비밀번호 저장
        for (int i = 0; i < N; i++) {
            String[] temp2 = br.readLine().split(" ");
            passwordMap.put(temp2[0], temp2[1]); // (사이트, 비밀번호) 저장
        }

        // M개의 사이트에 대해 비밀번호 찾기
        for (int i = 0; i < M; i++) {
            String site = br.readLine();
            sb.append(passwordMap.get(site)).append("\n"); // HashMap에서 O(1) 탐색
        }

        System.out.print(sb.toString()); // 출력 최적화
    }
}
