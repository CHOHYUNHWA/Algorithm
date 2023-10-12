import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[][] dp = new int[N+1][N+1];

        for(int i = 2; i <= N; i++){
            dp[1][i] = i;
        }

        for(int i = 2; i<=N; i++){
            for(int j = 4; j<= N; j++){
                if(i/2 > 0) {
                    dp[i][j] = (dp[i-1][j-2] + dp[i][j-1])%1_000_000_003;
                }
            }
        }
        System.out.println(dp[K][N]);
    }
}