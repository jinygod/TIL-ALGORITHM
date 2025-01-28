import java.util.*;
import java.io.*;

public class Main{
    public static int[] dp = new int[1001];
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        // 2×n 크기의 직사각형을 1×2, 2×1 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
        // 아래 그림은 2×5 크기의 직사각형을 채운 한 가지 방법의 예이다.
        // 1. 초기값 세팅
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;    
        
        // 2. dp 배열 채우기
        for(int i = 4; i <= 1000; i++){
            dp[i] = (dp[i -2] + dp[i - 1]) % 10007;
        }
        // 3. 출력
        System.out.println(dp[n]);
    }
}