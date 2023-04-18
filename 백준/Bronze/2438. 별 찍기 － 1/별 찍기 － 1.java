import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "*";
        for(int i = 0 ; i < n; i++){
            System.out.println(s);
            s += "*";
        }
    }
}