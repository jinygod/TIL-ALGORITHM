import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        String ans = "1"; // 기본적으로는 1로 초기화

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                ans = "0";
                break; // 다른 문자를 찾으면 루프를 빠져나옴
            }
        }
        System.out.println(ans);
    }
}
