import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[][] pack = new int[N+1][2];
        int[][] dp = new int[N+1][K+1];
        for(int i = 1 ; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            pack[i][0] = Integer.parseInt(st.nextToken());
            pack[i][1] = Integer.parseInt(st.nextToken());
        }
        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= K; j++){
                if(j - pack[i][0] >= 0){
                    dp[i][j] = Math.max(dp[i-1][j], pack[i][1] + dp[i-1][j-pack[i][0]]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}