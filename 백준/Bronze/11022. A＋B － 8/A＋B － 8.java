import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a+b;
            System.out.println("Case #"+i+": "+ a + " + " + b + " = " +c);
        }
    }
}
