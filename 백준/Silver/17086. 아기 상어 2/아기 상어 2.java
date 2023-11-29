import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int M;
    static int[][] map;
    static int result = -1;
    static int[] dx = {0,0,1,-1,1,-1,1,-1};
    static int[] dy = {1,-1,0,0,1,-1,-1,1};
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N+1][M+1];

        result = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            st= new StringTokenizer(br.readLine());
            for(int j  = 0 ; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i = 0; i < N; i++){
            for(int j  = 0 ; j < M; j++){
                if(map[i][j] == 1){
                    continue;
                }
                int tmp = bfs(i,j);
                result = Math.max(tmp, result);
            }
        }
        System.out.println(result);
    }

    private static int bfs(int x, int y) {
        Queue<Point> queue = new LinkedList<>();
        visited = new boolean[N+1][M+1];
        queue.offer(new Point(x,y,0));
        visited[x][y] = true;

        while (!queue.isEmpty()){
            Point point = queue.poll();
            for(int i = 0; i < dx.length; i++){
                int cx = point.x + dx[i];
                int cy = point.y + dy[i];
                int cDistance = point.distance +1;


                if(cx < 0 || cy < 0 || cx >= N || cy >= M || visited[cx][cy]){
                    continue;
                }

                if(map[cx][cy] == 1){
                    return cDistance;
                }

                queue.offer(new Point(cx,cy,cDistance));
                visited[cx][cy] = true;
            }
        }
        return 0;
    }


    static class Point{
        int x;
        int y;
        int distance;

        public Point(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}