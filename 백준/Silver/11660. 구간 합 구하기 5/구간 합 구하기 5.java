import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                dp[i][j] = dp[i][j-1] + Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i < M; i++){
            int result = 0;
            st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            for(int j = startX; j <= endX; j++){
                result += dp[j][endY] - dp[j][startY-1];
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}