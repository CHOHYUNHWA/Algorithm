import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[] visited;
    static int count;
    static int total;
    static int min = Integer.MAX_VALUE;
    static int N, M;
    static int result;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }

        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1];
            total = 0;
            bfs(i);
            if(total < min){
                min = total;
                result = i;
            }
        }
        System.out.println(result);
    }

    private static void bfs(int i) {
        count = 0;
        queue.add(i);
        visited[i] = true;
        while(!queue.isEmpty()){
            count++;
            int len = queue.size();
            for(int j = 0; j < len; j++){
                int current = queue.poll();
                for(int k = 1; k <= N; k++){
                    if(map[current][k] == 1 && !visited[k]){
                        total += count;
                        visited[k] = true;
                        queue.add(k);
                    }
                }
            }
        }
    }
}