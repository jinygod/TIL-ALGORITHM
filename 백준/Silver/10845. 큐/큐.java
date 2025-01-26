import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> queue = new ArrayList<>();
        
        for(int i = 0; i < N; i++){
            String[] temp = br.readLine().split(" ");
            String order = temp[0];
            
            if(order.equals("push")){
                
            int number = Integer.parseInt(temp[1]);
                queue.add(number);
            }
            else if(order.equals("pop")){
                if(!queue.isEmpty()){
                    System.out.println(queue.get(0));
                    queue.remove(queue.get(0));
                }
                else{
                    System.out.println(-1);
                }
            }
            else if(order.equals("size")){
                System.out.println(queue.size());
            }
            else if(order.equals("empty")){
                if(!queue.isEmpty()){
                    System.out.println(0);
                }
                else{
                    System.out.println(1);
                }
            }
            else if(order.equals("front")){
                if(!queue.isEmpty()){
                    System.out.println(queue.get(0));
                }    
                else{
                    System.out.println(-1);
                }
            }
            else{
                if(!queue.isEmpty()){
                    System.out.println(queue.get(queue.size() -1));
                }
                else{
                    System.out.println(-1);
                }
            }
        }
    }
}