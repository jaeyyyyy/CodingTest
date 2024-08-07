import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(bf.readLine());
        int two = Integer.parseInt(bf.readLine());
        bf.close();
        
        int c = two % 10;
        int b = (two / 10) % 10;
        int a = (two / 100) % 10;
        
        
        System.out.println(one * c);
        System.out.println(one * b);
        System.out.println(one * a);
        System.out.println(one * two);
    }
}