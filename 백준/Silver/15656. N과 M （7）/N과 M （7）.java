import java.io.*;
import java.util.*;

public class Main {
    static int[] input;
    static int[] arr;
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        input = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < input.length; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(input);

        arr = new int[M];

        dfs(0,0);

        System.out.println(sb);

    }

    private static void dfs(int depth, int start) {
        if(depth == M){
            for (int i : arr) {
                sb.append(i).append(" ");
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++) {
                arr[depth] = input[i];
                dfs(depth + 1,i+1);
        }
    }
}
