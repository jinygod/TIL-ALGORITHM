import java.util.*;

class Solution {
    public ArrayList<Long> solution(long n) {
        ArrayList<Long> answer = new ArrayList<>();
        
        while(n > 0){
            long temp = n % 10;
            answer.add(temp);
            n /= 10;
        }
        return answer;
    }
}