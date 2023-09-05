import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] arr;
    static Integer[][] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        dp = new Integer[N][N];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < i + 1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            dp[N-1][i] = arr[N-1][i];
        }

        System.out.println(dp(0,0));

    }

    private static int dp(int depth, int idx) {
        if(depth == N -1){
            return dp[depth][idx];
        }
        if(dp[depth][idx] == null){
            dp[depth][idx] = Math.max(dp(depth+1, idx), dp(depth+1, idx +1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}