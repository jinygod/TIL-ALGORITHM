import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = Integer.MAX_VALUE; // 초기값 설정
        String[] subtraction = br.readLine().replace(" ", "").split("-"); // 공백 제거 후 '-'로 분리

        for (int i = 0; i < subtraction.length; i++) {
            int temp = 0;

            // "+"로 나누기
            String[] addition = subtraction[i].split("\\+");
            for (String part : addition) {
                if (!part.isEmpty()) { // 빈 문자열 방지
                    temp += Integer.parseInt(part);
                }
            }

            // 첫 번째 값 처리
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}
