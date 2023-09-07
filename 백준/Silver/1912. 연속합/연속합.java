import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static Integer[] arr;
    static Integer[] dp;
    static int max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new Integer[N];
        dp = new Integer[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        max = arr[0];

        dp(N-1);

        System.out.println(max);

    }

    private static int dp(int N) {
        if(dp[N] == null){
            dp[N] = Math.max(dp(N-1) + arr[N], arr[N]);
            max = Math.max(dp[N], max);
        }
        return dp[N];
    }
}