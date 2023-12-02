import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] dp = new int[N+1][M+1];

        for(int i = 0; i < N; i++){
            dp[i+1][1] = i;
        }
        for(int i = 0; i < M; i++){
            dp[1][i+1] = i;
        }

        for(int i = 2; i <= N; i++){
            for(int j = 2; j <=M; j++){
                dp[i][j] = dp[i][j-1] + i;
            }
        }
        System.out.println(dp[N][M]);
    }
}