import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int q = 25;
        int d = 10;
        int n = 5;
        for(int i = 0; i < T; i++) {
            sb.setLength(0);
            int tmp = sc.nextInt();
            sb.append(tmp/q).append(" ");
            tmp %= q;
            sb.append(tmp/d).append(" ");
            tmp %= d;
            sb.append(tmp/n).append(" ");
            tmp %= n;
            sb.append(tmp);
            System.out.println(sb);
        }
    }
}