import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        char[] chars = my_string.toCharArray();
        int[] answer = new int[chars.length];
        int idx = 0;
        
        for(int i = 0; i < chars.length; i++){
            char c = chars[i];
            if (Character.isDigit(c)) {
                answer[idx++] = Character.getNumericValue(c);
            }
        }
        
        // 오름차순으로 정렬
        Arrays.sort(answer, 0, idx);
        
        // for 루프에서 처리한 결과를 출력
        for (int i = 0; i < idx; i++) {
            System.out.println(answer[i]);
        }
        
        return Arrays.copyOfRange(answer, 0, idx);
    }
}
