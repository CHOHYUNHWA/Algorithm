import java.io.*;
import java.util.*;

public class Main {
    static Long[] DP = new Long[101];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());

            DP[0] = 0L;
            DP[1] = 1L;
            DP[2] = 1L;

            DP[N] = padovan(N);
            sb.append(DP[N]).append('\n');
        }
        System.out.println(sb);
    }

    static long padovan(int N) {
        if (DP[N] == null) {
            DP[N] = padovan(N - 3) + padovan(N - 2);
        }
        return DP[N];
    }
}