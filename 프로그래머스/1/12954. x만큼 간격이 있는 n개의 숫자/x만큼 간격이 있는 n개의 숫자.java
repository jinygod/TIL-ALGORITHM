import java.util.*;

class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            answer.add((long)x * (i + 1));
        }
        
        return answer;
    }
}
