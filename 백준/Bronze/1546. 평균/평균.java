import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt(); // 총 과목 개수
        double max = 0.0; // 최대 점수
        double sum = 0.0; // 점수 평균
        
        for(int i = 0; i < N; i++) {
            double score = in.nextDouble();
            
            if(score > max) {
                max = score;
            }
            
            sum += score;
        }
        in.close();
        
        System.out.println(((sum/max) * 100.0) / N);
    }
}