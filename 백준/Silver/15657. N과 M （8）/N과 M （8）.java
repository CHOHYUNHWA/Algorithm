import java.util.*;
import java.io.*;

public class Main {

    static int N,M;
    static int[] list;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        list = new int[N];
        arr = new int[M];

        st= new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(list);
        dfs(0, 0);

        System.out.println(sb);
    }

    private static void dfs(int start, int depth) {
        if(depth == M){
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }

        for(int i = start; i < N; i++){
             arr[depth] = list[i];
             dfs(i,depth+1);
        }
    }
}