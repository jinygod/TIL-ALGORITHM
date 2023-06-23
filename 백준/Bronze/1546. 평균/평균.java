import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            int N = Integer.parseInt(br.readLine());
            double[] N_list = new double[N];
            
            String[] input = br.readLine().split(" ");
            for (int i = 0; i < N_list.length; i++) {
                N_list[i] = Double.parseDouble(input[i]);
            }
            
            double max_value = N_list[0];
            
            for (int i = 1; i < N_list.length; i++) {
                if (N_list[i] > max_value) {
                    max_value = N_list[i];
                }
            }
            
            double[] new_score = new double[N];
            
            double sum = 0.0;
            
            for (int i = 0; i < new_score.length; i++) {
                new_score[i] = N_list[i] / max_value * 100;
                sum += new_score[i];
            }
            
            double avg = sum / N;
            
            System.out.println(avg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
