class Solution {
    public static int solution(int i, int j, int k) {
        int count = 0;
        for (int n = i; n <= j; n++) {
            String str = String.valueOf(n);
            int numK = 0;
            for (int m = 0; m < str.length(); m++) {
                if (str.charAt(m) == (char)(k + '0')) {
                    numK++;
                }
            }
            count += numK;
        }
        return count;
    }

}