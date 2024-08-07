import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(bf.readLine()) % 42;
        }
        bf.close();
        boolean b;
        int count = 0;
        for(int i = 0; i < 10; i++) {
            b = false;
            for(int j = i+1; j < 10; j++) {
                if(arr[i] == arr[j]) {
                    b = true;
                    break;
                }
            }
            if(b == false) {
               count++;
            }
        }
        System.out.println(count);
        
    }
}