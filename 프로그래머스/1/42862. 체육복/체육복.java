import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n; // 모든 학생이 체육복을 가지고 있다고 가정
        
        // 중복 제거
        boolean[] isLost = new boolean[n + 1];
        boolean[] isReserve = new boolean[n + 1];
        
        for (int l : lost) {
            isLost[l] = true;
        }
        for (int r : reserve) {
            if (isLost[r]) {
                isLost[r] = false; // 여벌 있지만 도난당한 경우 처리
            } else {
                isReserve[r] = true; // 빌려줄 수 있는 학생만 남김
            }
        }
        
        // 체육복 빌려주기
        for (int i = 1; i <= n; i++) {
            if (isLost[i]) {
                if (i > 1 && isReserve[i - 1]) {
                    isReserve[i - 1] = false;
                } else if (i < n && isReserve[i + 1]) {
                    isReserve[i + 1] = false;
                } else {
                    answer--; // 체육복을 빌리지 못한 학생
                }
            }
        }
        
        return answer;
    }
}
