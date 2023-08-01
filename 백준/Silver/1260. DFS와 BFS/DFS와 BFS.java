import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] map;
    static boolean[] visit;
    static int N, M, V;
    static Queue<Integer> queue;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        map = new int[N + 1][N + 1];
        visit = new boolean[N+1];
        for(int i =0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }

        dfs(V);
        sb.append('\n');
        Arrays.fill(visit,false);
        bfs(V);
        System.out.println(sb);

    }

    private static void dfs(int start) {
        visit[start] = true;
        sb.append(start).append(" ");
        for(int i = 1; i <= N; i++){
            if(map[start][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        queue = new LinkedList<>();
        queue.add(start);
        visit[start] = true;
        sb.append(start).append(" ");
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            for(int i = 1; i<map.length; i++){
                if(map[tmp][i] == 1 && !visit[i]){
                    queue.add(i);
                    visit[i] = true;
                    sb.append(i).append(" ");
                }
            }
        }
    }
}