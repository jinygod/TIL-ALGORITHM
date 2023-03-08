class Solution {
    public String solution(int age) {
        return age / 10 < 1 ? String.valueOf((char) (age % 10 + 'a')) : solution(age / 10) + (char) (age % 10 + 'a');
    }
}
