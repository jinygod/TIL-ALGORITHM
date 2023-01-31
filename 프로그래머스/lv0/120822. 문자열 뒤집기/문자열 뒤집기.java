class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] strArray = my_string.split("");
        
        for(int i = 0; i < strArray.length; i++){
            answer += strArray[strArray.length-1-i];
        }
        
        return answer;
    }
}