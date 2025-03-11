import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] temp = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int A = Integer.parseInt(temp[1]);
        int B = Integer.parseInt(temp[2]);
        
        if(A < B){
            System.out.print("Bus");
        }
        else if(A > B && A > N){
            System.out.print("Subway");
        }
        else{
            System.out.print("Anything");
        }
    }
}