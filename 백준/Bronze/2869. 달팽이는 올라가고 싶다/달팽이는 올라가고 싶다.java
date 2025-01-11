import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        // (V - A) / (A - B)를 올림 처리 + 1
        int day = (int)Math.ceil((double)(V - A) / (A - B)) + 1;
        
        System.out.println(day);
    }
}
