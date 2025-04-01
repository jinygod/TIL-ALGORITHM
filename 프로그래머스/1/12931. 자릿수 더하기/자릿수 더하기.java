import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n >= 0){
            if(n >= 10){
              answer += n % 10;
              n /= 10;
            }
            else{
                answer += n;
                break;
            }
            
        }
        return answer;
    
}
}