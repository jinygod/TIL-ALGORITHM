import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong(); // long 타입으로 입력값 받기
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        long sum = a + b + c;
        
        System.out.println(sum);
    }
}
