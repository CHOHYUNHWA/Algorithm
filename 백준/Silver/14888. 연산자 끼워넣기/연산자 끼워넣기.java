import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[] arr;
    static int[] operator = new int[4];
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < 4; i++){
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr[0],1);
        sb.append(max).append('\n').append(min);
        System.out.println(sb);

    }

    private static void dfs(int num, int idx) {
        if(idx == N){
            max = Math.max(num, max);
            min = Math.min(num, min);
            return;
        }
        for(int i = 0 ;  i < 4; i++){
            if(operator[i] > 0){
                operator[i]--;

                switch (i){
                    case 0 : dfs(num + arr[idx], idx +1); break;
                    case 1 : dfs(num - arr[idx], idx +1); break;
                    case 2 : dfs(num * arr[idx], idx +1); break;
                    case 3 : dfs(num / arr[idx], idx +1); break;
                }
                operator[i] ++;
            }
        }
    }
}