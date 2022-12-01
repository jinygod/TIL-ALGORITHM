import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
       
 
        while(true) {
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
            
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	int z = Integer.parseInt(st.nextToken());
        	
        	
			// 0 0 0 을 입력받으면 종료
        	if(x == 0 && y == 0 && z == 0) break;
            
        	
        	if((x * x + y * y) == z * z) {
				sb.append("right").append('\n');
			}
        	else if(x * x == (y * y + z * z)) {
				sb.append("right").append('\n');
			}
        	else if(y * y == (z * z + x * x)) {
				sb.append("right").append('\n');
			}
        	else {
				sb.append("wrong").append('\n');
			}
        	
		}
		System.out.println(sb);
	}
 
}