import java.util.*;
import java.io.*;


public class Main {
    static int[] arr;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        dfs(1,0);
        System.out.println(sb);


    }

    private static void dfs(int start, int depth) {
        if(depth == M){
            for(int var : arr){
                sb.append(var).append(' ');
            }
            sb.append('\n');
            return;
        }
        for(int i = 1; i <= N; i++){
            arr[depth] = i;
            dfs(i,depth +1);
        }
    }
}