import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열 정렬
        Arrays.sort(numbers);
        
        int n = numbers.length;
        int max = Integer.MIN_VALUE;
        
        // 가장 큰 양수와 가장 작은 음수의 곱 구하기
        if (numbers[0] < 0 && numbers[n-1] > 0) {
            int positiveMax = numbers[n-1] * numbers[n-2];
            int negativeMax = numbers[0] * numbers[1];
            max = Math.max(max, Math.max(positiveMax, negativeMax));
        }
        
        // 가장 큰 두 양수의 곱 구하기
        int twoPositivesMax = numbers[n-1] * numbers[n-2];
        max = Math.max(max, twoPositivesMax);
        
        return max;
    }
}
