import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 문자열 입력
        String S = scanner.nextLine();
        
        // 정수 i 입력
        int i = scanner.nextInt();
        
        // i번째 글자 출력
        if (i >= 1 && i <= S.length()) {
            char result = S.charAt(i - 1);
            System.out.println(result);
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
        
        scanner.close();
    }
}
