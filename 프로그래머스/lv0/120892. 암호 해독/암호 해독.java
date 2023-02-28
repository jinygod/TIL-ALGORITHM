class Solution {
    public String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        String[] cipherArray = cipher.split("");
        for (int i = 0; i < cipherArray.length; i++) {
            if ((i + 1) % code == 0) sb.append(cipherArray[i]);
        }
        return sb.toString();
    }
}
