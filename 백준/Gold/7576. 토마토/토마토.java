import java.io.*;
import java.util.*;

public class Main {
    static int M, N;
    static int[][] box;
    static Queue<Point> queue = new LinkedList<>() {
    };
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int tmp = Integer.parseInt(st.nextToken());
                box[i][j] = tmp;
                if (tmp == 1) {
                    queue.add(new Point(i, j));
                }
            }
        }
        System.out.println(bfs());
    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            for (int i = 0; i < 4; i++) {
                int cx = point.x + dx[i];
                int cy = point.y + dy[i];

                if (cx < 0 || cy < 0 || cx >= N || cy >= M) {
                    continue;
                }
                if (box[cx][cy] == 0) {
                    box[cx][cy] = box[point.x][point.y] + 1;
                    queue.add(new Point(cx, cy));
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(box[i][j] == 0){
                    return -1;
                }
                if(max < box[i][j]){
                    max = box[i][j];
                }
            }
        }
        return max-1;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}