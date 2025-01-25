import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String word = br.readLine();
            if (word.equals("0")) {
                break;
            }

            Deque<Character> deque = new ArrayDeque<>();
            for (char ch : word.toCharArray()) {
                deque.addLast(ch);
            }

            String answer = "yes";
            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    answer = "no";
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}
