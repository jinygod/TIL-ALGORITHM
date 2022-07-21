import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
 
	public static void main(String[] args) throws IOException{
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26]; // 영문자의 개수는 26개임
		String s = br.readLine();
		
 
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') { // 대문자 
				arr[s.charAt(i) - 97]++; // 입력값이 대문자일시 1증가
			} else { // 소문자
				arr[s.charAt(i) - 65]++; // 입력값이 소문자일시 1증가
			}
		}
		int max = -1; // 최대값 초기화
		char ch = '?'; 
		for (int i = 0; i < 26; i++) {
 
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} 
			else if (arr[i] == max) { 
				ch = '?';
			}
		}
		System.out.print(ch);
	}
 
}