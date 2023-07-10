class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        StringBuilder ms = new StringBuilder(myString);

        for (int i = 0; i < myString.length(); i++) {
            if (ms.charAt(i) == 'A') {
                ms.setCharAt(i, 'B');
            } else {
                ms.setCharAt(i, 'A');
            }
        }

        if (ms.indexOf(pat) != -1) {
            return 1;
        } else {
            return 0;
        }
    }
}
