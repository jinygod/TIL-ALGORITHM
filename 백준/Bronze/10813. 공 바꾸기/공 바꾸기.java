import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] num = new int[N];
        for (int i=1; i<=N; i++)
            num[i-1] = i;
        while(M-->0){
            int n1 = sc.nextInt()-1;
            int n2 = sc.nextInt()-1;
            int temp = num[n1];
            num[n1] = num[n2];
            num[n2] = temp;
        }
        Arrays.stream(num).forEach(i-> System.out.print(i+" "));
    }
}