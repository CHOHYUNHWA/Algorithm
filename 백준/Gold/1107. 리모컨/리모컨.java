import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        boolean[] broken = new boolean[10];
        if(M > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                int brokenNumber = Integer.parseInt(st.nextToken());
                broken[brokenNumber] = true;
            }
        }
        int result = Math.abs(target - 100);
        for (int i = 0; i <= 999999; i++) {
            String current = String.valueOf(i);
            boolean check = false;
            for (int j = 0; j < current.length(); j++) {
                if (broken[current.charAt(j) - '0']) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                result = Math.min(result, current.length() + Math.abs(target - i));
            }
        }
        System.out.println(result);
    }
}