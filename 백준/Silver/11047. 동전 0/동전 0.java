import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        
        int[] coin = new int[N];
        
        for(int i = 0; i < coin.length; i++){
            coin[i] = Integer.parseInt(br.readLine());
        }
        
        int count = 0;
        for(int i = N -1; i >= 0; i--){
            if(K / coin[i] > 0){
                count += K / coin[i];
                K %= coin[i];
            }
        }
        System.out.print(count);
        br.close();
    }
}