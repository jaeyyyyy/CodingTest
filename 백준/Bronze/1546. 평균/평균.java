import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 과목의 수
        double sum = 0;
        double max = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            double score = Double.parseDouble(st.nextToken());
            if(score > max) {
                max = score;
            }
            sum += score;
        }
        br.close();
        
        System.out.println(((sum / max) * 100.0) / N);
    }
}