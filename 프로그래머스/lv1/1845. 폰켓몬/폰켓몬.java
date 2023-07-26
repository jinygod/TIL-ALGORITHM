import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxTypes = nums.length / 2;
        HashSet<Integer> uniqueTypes = new HashSet<>();

        for (int num : nums) {
            uniqueTypes.add(num);
        }

        return Math.min(uniqueTypes.size(), maxTypes);
    }
}
