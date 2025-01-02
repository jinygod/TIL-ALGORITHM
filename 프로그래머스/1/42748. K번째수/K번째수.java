import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 결과를 저장할 배열
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1; // 시작 인덱스 (0-based)
            int end = commands[i][1];       // 끝 인덱스 (exclusive for subArray)
            int k = commands[i][2] - 1;     // K번째 값 (0-based)
            
            // 구간 자르기
            int[] subArray = Arrays.copyOfRange(array, start, end);
            
            // 정렬
            Arrays.sort(subArray);
            
            // K번째 수 저장
            answer[i] = subArray[k];
        }
        
        return answer;
    }
}
