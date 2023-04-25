import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();
        int answer = 0;
        for (char c : arr) {
            answer += Character.getNumericValue(c);
        }
        System.out.println(answer);
    }
}