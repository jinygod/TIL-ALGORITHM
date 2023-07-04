import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> solution(int start, int end) {
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(i);
        }
        return result;
    }
}
