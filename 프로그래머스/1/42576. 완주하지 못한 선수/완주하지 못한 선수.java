import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 추가 (이름별 등장 횟수 카운트)
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 완주한 사람 제거
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 완주하지 못한 선수 찾기 (값이 1인 경우)
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }

        return "";
    }
}
