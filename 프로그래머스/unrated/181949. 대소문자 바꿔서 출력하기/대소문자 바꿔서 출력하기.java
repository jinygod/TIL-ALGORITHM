import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] array = a.toCharArray();
        
        for(int i = 0; i < array.length; i++){
            if(array[i] <= 90){
                array[i] += 32;
            }
            else{
                array[i] -= 32;
            }
        }
        System.out.println(array);
    }
}