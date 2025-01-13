import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 전화번호 정렬
        Arrays.sort(phone_book);
        
        // 인접한 두 전화번호만 비교 (정렬했기 때문에 접두어 관계 가능)
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
        }
        return true;
    }
}
