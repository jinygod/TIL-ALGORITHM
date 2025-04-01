class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] charArray = s.toCharArray();
        int pcnt = 0;
        int ycnt = 0;
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] == 'p' || charArray[i] == 'P'){
                pcnt++;
            }
            else if(charArray[i] == 'y' || charArray[i] == 'Y'){
                ycnt++;
            }
        }
        if(pcnt != ycnt){
            answer = false;
        }

        return answer;
    }
}