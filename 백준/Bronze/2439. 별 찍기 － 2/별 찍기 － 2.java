import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        bf.close();
        
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for(int k = n; k > n - i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}