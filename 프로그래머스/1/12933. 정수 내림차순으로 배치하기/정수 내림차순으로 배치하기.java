import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        
        while(n > 0){
            arr.add((int)(n % 10));
            n /= 10;
        }
        
        Collections.sort(arr, Collections.reverseOrder()); // 내림차순 정렬
        
        for(int i = 0; i < arr.size(); i++){
            answer += arr.get(i) * Math.pow(10, arr.size() - 1 - i);
        }
        
        return answer;
    }
}
