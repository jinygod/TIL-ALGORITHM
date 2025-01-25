import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[6];
        String[] temp = br.readLine().split(" ");
        
        for(int i = 0; i < 6; i++){
            arr[i] = Integer.parseInt(temp[i]);
        }
        String[] temp2 = br.readLine().split(" ");
        int T = Integer.parseInt(temp2[0]);
        int P = Integer.parseInt(temp2[1]);
        
        int firstanswer = 0;
        
        for(int i = 0; i < 6; i++){
            firstanswer += (arr[i] + T - 1) / T; // 올림 계산
        }
        
        System.out.println(firstanswer);
        
        int pen = 0;
        int remindPen = 0;
        
        pen = N / P;
        remindPen = N % P;
        
        System.out.print(pen + " " + remindPen);
    }
}