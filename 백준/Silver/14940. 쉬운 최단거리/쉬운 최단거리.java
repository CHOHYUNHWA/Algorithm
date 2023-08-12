import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static int n;
    static int m;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static int targetX;
    static int targetY;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        for(int i = 0 ; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++){
                int point = Integer.parseInt(st.nextToken());
                if(point == 2){
                    targetX = i;
                    targetY = j;
                    map[i][j] = 0;
                }
                if(point == 1){
                    map[i][j] = -1;
                }
                if(point == 0){
                    map[i][j] = 0;
                }
            }
        }
        bfs(targetX, targetY);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sb.append(map[i][j]).append(' ');
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

    private static void bfs(int targetX, int targetY) {
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{targetX,targetY});
        while (!queue.isEmpty()){
            int[] spot = queue.poll();
            for(int i = 0 ; i < 4; i++){
                int cx = spot[0] + dx[i];
                int cy = spot[1] + dy[i];

                if(cx < 0 || cy < 0 || cx >=n || cy >= m){
                    continue;
                }
                if(map[cx][cy] != -1){
                    continue;
                }
                if(map[cx][cy] == -1){
                    map[cx][cy] = map[spot[0]][spot[1]]+1;
                }
                queue.add(new int[]{cx,cy});
            }
        }
    }
}