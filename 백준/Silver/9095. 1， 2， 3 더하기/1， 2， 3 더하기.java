import java.io.*;
import java.util.*;

public class Main {
    static int[] DP = new int[12];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        DP[1] = 1;
        DP[2] = 2;
        DP[3] = 4;
        for (int i = 4; i <= 11; i++) {
            DP[i] = DP[i - 1] + DP[i - 2] + DP[i - 3];
        }
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            sb.append(DP[n]).append('\n');
        }
        System.out.println(sb);
    }
}