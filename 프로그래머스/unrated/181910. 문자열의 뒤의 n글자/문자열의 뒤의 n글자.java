class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder(my_string);
        
        answer.delete(0, my_string.length() - n);
        
        return answer.toString();
    }
}