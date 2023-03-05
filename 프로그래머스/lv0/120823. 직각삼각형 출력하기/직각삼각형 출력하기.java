import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){ // 1부터 n까지 반복
            for(int j = 1; j <= i; j++){ // 1부터 i까지 '*' 출력
                System.out.print('*');
            }
            System.out.println(); // 줄바꿈
        }

    }
}
