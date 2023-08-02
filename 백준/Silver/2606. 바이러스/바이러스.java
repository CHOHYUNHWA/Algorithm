import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visit;
    static int count = 0;
    static int[][] graph;
    static int node, line;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());
        graph = new int[node+1][node+1];
        visit = new boolean[node+1];

        for(int i = 0; i < line; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }
        dfs(1);
        System.out.println(count);

    }

    private static void dfs(int start) {
        visit[start] = true;
        for(int i = 1; i <= node; i++){
            if(graph[start][i] == 1 && !visit[i]){
                count++;
                dfs(i);
            }
        }
    }
}