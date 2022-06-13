import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if(b < 45){
            if(a == 0){
                a = 23;
                b += 15;
            }
            else{
                a -= 1;
                b += 15;
            }
        }
        else{
            b = b-45;
        }
        System.out.println(a + " " + b);
    }
}
