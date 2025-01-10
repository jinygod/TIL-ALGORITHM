import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int x = Integer.parseInt(br.readLine());
        
        Arrays.sort(arr);
        
        int answer = 0;
        int left = 0;
        int right = n - 1;
        
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == x){
                answer++;
                left++;
                right--;
            }    
            else if(sum > x){
                right--;
            }
            else{
                left++;
            }
            
        }
        System.out.print(answer);
        
    }
}