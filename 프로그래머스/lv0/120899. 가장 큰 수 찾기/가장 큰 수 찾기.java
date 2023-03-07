import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] array) {
        int maxIndex = IntStream.range(0, array.length).reduce((a, b) -> array[a] > array[b] ? a : b).getAsInt();
        return new int[] { array[maxIndex], maxIndex };
    }
}
