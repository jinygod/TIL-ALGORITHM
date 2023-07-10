class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        for (int i = 0; i < num_str.length(); i++) {
            int digit = num_str.charAt(i) - '0'; // 문자를 숫자로 변환
            answer += digit; // 각 자리 숫자를 더함
        }
        
        return answer;
    }
}
