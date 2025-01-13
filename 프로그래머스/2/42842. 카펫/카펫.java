class Solution {
    public int[] solution(int brown, int yellow) {
        // 정답 배열
        int[] answer = new int[2];
        
        // 넓이 = 갈색 + 노란색
        int area = brown+yellow;
        
        // 가로, 세로 최소값(3) 
        // ex) 가로 : 노란색 최소값 1 이면, 갈색은 양옆 2 필요(1+2=3)
        // ex) 세로 : 노란색 최소값 1 이면, 갈색은 위아래 2 필요(1+2=3) 
        int start = 3;
        
        // 가로, 세로 최대값(넓이/3)
        // ex) 가로, 세로 최소값 3부터 시작이기 때문에, 
        // ex) 최대값은 (넓이/3) 까지만 탐색하면 됨.
        int end = area/3;
        
        // 완전 탐색
        for(int w=start;w<=end;w++){
            for(int h=start;h<=end;h++){
                // 1) 넓이가 w*h 이면서
                // 2) 위아래, 양옆 가장자리를 뺀 넓이가 노란색이면서
                // 3) 가로가, 세로보다 크거나 같으면 
                if((w*h==area) && ((w-2)*(h-2)==yellow) && w>=h){
                    answer[0]=w;
                    answer[1]=h;
                    return answer;
                }
            }
        }
        return answer;
    }
}