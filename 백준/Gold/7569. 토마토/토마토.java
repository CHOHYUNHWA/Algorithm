import java.io.*;
import java.util.*;

public class Main {
    static int M,N,H;
    static int[][][] box;
    static int[] dx= new int[]{0,0,1,-1,0,0};
    static int[] dy = new int[]{1, -1, 0, 0, 0, 0};
    static int[] dz = new int[]{0, 0, 0, 0, 1, -1};
    static int result = Integer.MIN_VALUE;
    static Queue<Point> queue = new LinkedList<>();
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[H][N][M];
        for(int i = 0; i < H; i++){
            for(int j = 0; j < N; j++){
                st = new StringTokenizer(br.readLine());
                for(int k = 0; k < M; k++){
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                    if(box[i][j][k] == 1){
                        queue.add(new Point(i,j,k));
                    }
                }
            }
        }

        System.out.println(bfs());


    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for(int i = 0; i < 6; i++){
                int cx = point.x + dx[i];
                int cy = point.y + dy[i];
                int cz = point.z + dz[i];
                if(cx < 0 || cy <0 || cz <0 || cx >= H || cy >= N || cz >= M){
                    continue;
                }
                if(box[cx][cy][cz] != 0){
                    continue;
                }
                box[cx][cy][cz] = box[point.x][point.y][point.z] + 1;
                queue.add(new Point(cx,cy,cz));
            }
        }
        for(int i = 0; i < H; i++){
            for(int j = 0; j < N; j++){
                for(int k = 0; k < M; k++){
                    if(box[i][j][k] == 0){
                        return -1;
                    }
                    result = Math.max(result, box[i][j][k]);
                }
            }
        }
        return result-1;
    }

    static class Point{
        int x;
        int y;
        int z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}