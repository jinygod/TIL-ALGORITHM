class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aa = (int) Math.pow(a, 2);
        int bb = (int) Math.pow(b, 2);
        
        if (a % 2 != 0 && b % 2 != 0) {
            answer = aa + bb;
        } else if (a % 2 == 0 && b % 2 == 0) {
            answer = Math.abs(a - b);
        } else {
            answer = 2 * (a + b);
        }
        
        return answer;
    }
}
