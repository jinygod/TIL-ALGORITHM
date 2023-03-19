class Solution {
    public int solution(int num, int k) {
        String numString = Integer.toString(num);
        int position = numString.indexOf(Integer.toString(k)) + 1;
        return position > 0 ? position : -1;
    }
}
