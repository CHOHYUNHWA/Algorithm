import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int count = sc.nextInt();
        for(int i = 0; i<count; i++) {
            String s = sc.next();
            System.out.println(sb.append(s.charAt(0)).append(s.charAt(s.length()-1)));
            sb.setLength(0);
        }
    }
}