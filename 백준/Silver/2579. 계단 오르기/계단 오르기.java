import java.io.*;
import java.util.*;

public class Main {
    static Integer DP[];
    static int stair[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        DP= new Integer[N+1];
        stair = new int[N+1];

        for(int i = 1; i <= N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }


        DP[0] = stair[0];
        DP[1] = stair[1];

        if(N >= 2){
            DP[2] = stair[1] + stair[2];
        }

        for(int i = 3; i <= N; i++){
            DP[i] = Math.max(stair[i-1] + DP[i-3], DP[i-2]) + stair[i];
        }
        int result = DP[N];
        System.out.println(result);
    }
}