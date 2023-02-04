class Solution {
    public String solution(String my_string) {
        String answer1 = my_string.replaceAll("a", "");
        String answer2 = answer1.replaceAll("e", "");
        String answer3 = answer2.replaceAll("i", "");
        String answer4 = answer3.replaceAll("o", "");
        String answer = answer4.replaceAll("u", "");
        
        return answer;
    }
}