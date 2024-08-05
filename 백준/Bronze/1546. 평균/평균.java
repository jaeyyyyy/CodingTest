import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] score = new double[in.nextInt()]; // 배열에 점수를 담기
        for(int i = 0; i < score.length; i++) {
            score[i] = in.nextDouble();
        }
        in.close();
        double sum = 0;
        Arrays.sort(score);
        for(double s: score) {
            sum += s;
        }
        System.out.println(((sum / score[score.length - 1]) * 100.0) / score.length);
    }
}