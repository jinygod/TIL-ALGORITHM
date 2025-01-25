import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        long L = Long.parseLong(br.readLine()); // 문자열 길이
        String word = br.readLine(); // 입력 문자열
        
        long answer = 0;
        long power = 1; // 31^i 값을 저장
        
        final long mod = 1234567891; // 주어진 mod 값
        
        for (int i = 0; i < word.length(); i++) {
            // (현재 문자 값 * power) % mod
            answer = (answer + (word.charAt(i) - 'a' + 1) * power) % mod;
            // 다음 power 값 계산
            power = (power * 31) % mod;
        }
        
        System.out.println(answer);
    }
}
