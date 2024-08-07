import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(bf.readLine());
        int two = Integer.parseInt(bf.readLine());
        bf.close();
        
        ArrayList<Integer> digits = new ArrayList<>();
        int tem = two;
        while(tem > 0) {
            digits.add(tem % 10);
            tem /= 10;
        }
        
        for(int i : digits) {
            System.out.println(one * i);
        }
        System.out.println(one * two);
    }
}