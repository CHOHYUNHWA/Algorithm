import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int[][] map;
    static int[][] result;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        result = new int[N][N];
        visited = new boolean[N];

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j< N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            visited = new boolean[N];
            for(int j = 0; j < N; j++){
                if(map[i][j] == 1 && !visited[j]){
                    dfs(i,j);
                }
            }
        }
        for(int i = 0 ; i < N; i++){
            for(int j = 0; j < N; j++){
                sb.append(result[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    private static void dfs(int x, int y) {
        visited[y] = true;
        result[x][y] = 1;
        for(int i = 0 ; i < N; i++){
            if(map[y][i] == 1 && !visited[i]){
                dfs(x,i);
            }
        }
    }
}