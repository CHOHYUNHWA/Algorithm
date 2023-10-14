import java.io.*;
import java.util.*;


public class Main {
    static int N,M;
    static int[] memoryArr;
    static int[] costArr;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        memoryArr = new int[N + 1];
        costArr = new int[N + 1];
        dp = new int[N + 1][100001];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i  = 1 ; i <= N; i++){
            memoryArr[i] = Integer.parseInt(st1.nextToken());
            costArr[i] = Integer.parseInt(st2.nextToken());
        }

        for(int i = 1; i<=N; i++){
            for(int j = 0; j <=100000; j++){
                if(j < costArr[i] ){
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-costArr[i]] + memoryArr[i]);
                }
            }
        }
        for(int i  = 1; i <= 100000; i++){
            if(dp[N][i] >= M){
                System.out.println(i);
                return;
            }
        }
    }
}