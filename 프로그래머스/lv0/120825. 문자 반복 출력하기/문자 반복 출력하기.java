import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        
        char[] arr = my_string.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < n; j++){
                sb.append(arr[i]);
            }
        }
        
        
        return sb.toString();
    }
}