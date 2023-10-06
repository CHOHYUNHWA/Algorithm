import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] dp = new int[N+1];
        int[] before = new int[N+1];
        dp[1] = 0;

        for(int i = 2; i <= N; i++){
            dp[i] = dp[i-1] +1;
            before[i] = i-1;
            if(i%3 == 0 && dp[i/3]+1 < dp[i]){
                dp[i] = dp[i/3] +1;
                before[i] = i/3;
            }if(i%2 == 0 && dp[i/2]+1 < dp[i]) {
                dp[i] = dp[i / 2] + 1;
                before[i] = i / 2;
            }
        }
        sb.append(dp[N]).append('\n');
        while(N > 0){
            sb.append(N).append(" ");
            N = before[N];
        }
        System.out.println(sb);

    }
}