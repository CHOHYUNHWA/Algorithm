import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] DP = new int[N];
        int[] arr = new int[N];
        int size = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0 ; i < N; i++){
            DP[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[j] < arr[i] && DP[i] < DP[j] + 1){
                    DP[i] = DP[j] + 1;
                }
            }
        }
        for(int i = 0; i < N; i++){
            if(size < DP[i]){
                size = DP[i];
            }
        }
        System.out.println(size);
    }
}