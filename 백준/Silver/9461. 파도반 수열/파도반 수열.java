import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            long[] DP = new long[N+1];
            if(N <= 3){
                sb.append(1).append('\n');
                continue;
            }
            DP[0] = 0;
            DP[1] = 1L;
            DP[2] = 1L;

            for(int i = 3; i <= N; i++){
                DP[i] = DP[i-2] + DP[i-3];
            }
            sb.append(DP[N]).append('\n');
        }
        System.out.println(sb);
    }
}