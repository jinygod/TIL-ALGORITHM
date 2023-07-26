import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> nameCount = new HashMap<>();

        // 참가자 배열을 순회하며 이름 등장 횟수 카운트
        for (String name : participant) {
            nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
        }

        // 완주자 배열을 순회하며 이름 등장 횟수 1씩 감소
        for (String name : completion) {
            nameCount.put(name, nameCount.get(name) - 1);
        }

        // 이름 등장 횟수가 0인 참가자가 완주하지 못한 참가자
        for (String name : nameCount.keySet()) {
            if (nameCount.get(name) > 0) {
                return name;
            }
        }

        return "";
    }
}
