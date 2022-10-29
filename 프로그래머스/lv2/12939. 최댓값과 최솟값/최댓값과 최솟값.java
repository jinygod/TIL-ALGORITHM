import java.util.Arrays;

class Solution {
    public String solution(String s) {
        
		String[] strArray = s.split(" ");
		int[] arrayInt = new int[strArray.length];
		
		/*for (int i = 0; i < arrayInt.length; i++) {
			arrayInt[i] = Integer.parseInt(strArray[i]);
		}
        */
        
		//실행결과 속도는 foreach가 더 빠르게 나옴
		int idx = 0;
        
		for (String str : strArray) {
			arrayInt[idx] = Integer.parseInt(str); // 배열의 각 요소를 정수로 변경
			idx ++;
		}
		
		Arrays.sort(arrayInt); //sort 정렬
		//arrayInt[0] 최소값
		//arrayInt[arrayInt.length - 1] 최대값
		String result = arrayInt[0] + " " + arrayInt[arrayInt.length - 1];

		return result;
    }
}