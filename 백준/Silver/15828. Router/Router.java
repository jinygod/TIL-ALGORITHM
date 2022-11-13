import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) break;
            if (num == 0) {
                q.remove();
            } else if (size > q.size()) {
                q.add(num);
            }
        }
        if (q.isEmpty()) {
            System.out.print("empty");
        } else {
            for (int i : q) {
                sb.append(i + " ");
            }
            System.out.print(sb);
        }
    }
}