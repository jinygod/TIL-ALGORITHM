class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderString = Integer.toString(order);
        for (int i = 0; i < orderString.length(); i++) {
            char digit = orderString.charAt(i);
            if (digit == '3' || digit == '6' || digit == '9') {
                // 3, 6, 9가 있을 경우 answer에 1을 추가
                answer += 1;
            }
        }
        return answer;
    }
}

