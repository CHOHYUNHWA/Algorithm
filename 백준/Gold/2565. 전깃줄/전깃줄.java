import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] wire;
    static int[] dp;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dp = new int[n];
        wire = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            wire[i][0] = Integer.parseInt(st.nextToken());
            wire[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(wire, (o1, o2) -> o1[0] - o2[0]);

        for(int i = 0 ; i < dp.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(wire[i][1] > wire[j][1]){
                    dp[i] = Math.max(dp[i], dp[j] +1);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < dp.length; i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(n - max);
    }
}