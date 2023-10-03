import java.io.*;
import java.util.*;


public class Main {
    static int N;
    static int[][] rgb;
    static int[][] dp;
    static int min;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        rgb = new int[N+1][3];
        dp = new int[N+1][3];
        for(int i = 1; i <= N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            rgb[i][0] = Integer.parseInt(st.nextToken());
            rgb[i][1] = Integer.parseInt(st.nextToken());
            rgb[i][2] = Integer.parseInt(st.nextToken());
        }

        min = Integer.MAX_VALUE;

        for(int i = 0 ; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j){
                    dp[1][j] = rgb[1][j];
                } else {
                    dp[1][j] = 1000 * 1000 +1;
                }
            }
            for(int k = 2; k <= N; k++) {
                dp[k][0] = Math.min(dp[k - 1][1], dp[k - 1][2]) + rgb[k][0];
                dp[k][1] = Math.min(dp[k - 1][0], dp[k - 1][2]) + rgb[k][1];
                dp[k][2] = Math.min(dp[k - 1][1], dp[k - 1][0]) + rgb[k][2];
            }
            for(int l = 0; l < 3; l++){
                if(i!= l && min > dp[N][l]){
                    min = dp[N][l];
                }
            }
        }
        System.out.println(min);
    }
}