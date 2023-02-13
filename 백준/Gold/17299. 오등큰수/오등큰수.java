import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 배열의 입력
		int num = Integer.parseInt(bf.readLine());
		String[] input = bf.readLine().split(" ");
		
		// 결과값을 넣을 배열
		int[] result = new int[num];
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i< num; i++ {
			if(stack.isEmpty())
				stack.push(i);
			while(!stack.isEmpty() && nums_count[nums[stack.peek()]] < nums_count[nums[i]]){
				result[stack.pop()] = nums[i];
			}
			stack.push(i);
		}
		    while(!stack.isEmpty())
		    	result[stack.pop()] = -1;
		
		// 입력된 숫자를 담는 배열
		int[] nums = new int[num];
		for(int i = 0; i < num; i++)
			nums[i] = Integer.parseInt(input[i]);
		
		// 숫자들의 등장한 횟수를 담는 배열
		int[] nums_count = new int[1000001];
		for(int i = 0; i < num; i++)
			nums_count[nums[i]]+=1;
		
		// 인덱스 담을 Stack
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i = 0; i < num; i++) {
			if(stack.isEmpty())
				stack.push(i);
			while(!stack.isEmpty() && nums_count[nums[stack.peek()]] < nums_count[nums[i]]) {
				result[stack.pop()] = nums[i];
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty())
			result[stack.pop()] = -1;
		
		for(int i = 0; i < num; i++)
			bw.write(result[i]+" ");
		bw.flush();
		return;
	}
}
