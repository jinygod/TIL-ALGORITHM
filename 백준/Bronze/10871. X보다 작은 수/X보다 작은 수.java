import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] temp = br.readLine().split(" ");
        String[] temp2 = br.readLine().split(" ");
        int[] numbers = new int[2];
        int[] nums = new int[temp2.length];
        for(int i = 0; i < 2; i++){
            numbers[i] = Integer.parseInt(temp[i]);
        }
        for(int i = 0; i < numbers[0]; i++){
            nums[i] = Integer.parseInt(temp2[i]);
            if(nums[i] < numbers[1]){
                System.out.print(nums[i] + " ");
            }
        }
    }
}