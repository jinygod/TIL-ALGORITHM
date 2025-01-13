import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] array, int[][] commands) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < commands.length; i++) { 
            ArrayList<Integer> temp = new ArrayList<>();
            
            // 부분 배열 추출
            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {
                temp.add(array[j]); // 인덱스는 commands[i][0] - 1부터 시작
            }
            
            Collections.sort(temp); // 정렬
            
            // k번째 값을 추가
            answer.add(temp.get(commands[i][2] - 1)); // commands[i][2]는 1-based index
        }
        
        return answer;
    }
}
