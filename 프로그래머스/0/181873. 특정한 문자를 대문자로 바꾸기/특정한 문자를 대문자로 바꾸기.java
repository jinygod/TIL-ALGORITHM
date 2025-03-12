class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        char charAlp = alp.charAt(0);
        
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == charAlp){
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
        }
        
        
        
        return new String(charArr);
    }
}