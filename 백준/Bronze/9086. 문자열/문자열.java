import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int Test_Cnt = Integer.parseInt(st.nextToken());

        for (int i = 0; i < Test_Cnt; i++) {
            st = new StringTokenizer(br.readLine());
            String word = st.nextToken();
            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);
            System.out.println("" + first + last);
        }
    }
}
