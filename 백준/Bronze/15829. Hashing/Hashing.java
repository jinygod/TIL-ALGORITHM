import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int L = Integer.parseInt(br.readLine());
        
        String word = br.readLine();
        
        int answer = 0;
        
        for(int i = 0; i < word.length(); i++){
            answer += (word.charAt(i)-96) * (Math.pow(31,i));
        }
        
        System.out.print(answer);
    }
}