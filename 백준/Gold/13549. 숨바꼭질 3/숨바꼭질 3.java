
import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static int K;
    static boolean[] visited;
    static int result = Integer.MAX_VALUE;
    static int max = 100000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visited = new boolean[max+1];

        bfs();
        System.out.println(result);
    }

    private static void bfs() {
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(N, 0));

        while(!queue.isEmpty()){
            Point point = queue.poll();
            visited[point.x] = true;

            if(point.x == K){
                result = Math.min(result, point.cnt);
            }

            if(point.x * 2 <= max && !visited[point.x*2]){
                queue.offer(new Point(point.x*2, point.cnt));
            }
            if(point.x+1 <= max && !visited[point.x+1]){
                queue.offer(new Point(point.x+1, point.cnt +1 ));
            }
            if(point.x-1 >= 0 && !visited[point.x-1]){
                queue.offer(new Point(point.x-1, point.cnt +1 ));
            }
        }
    }

    static class Point{
        int x;
        int cnt;

        public Point(int x, int cnt) {
            this.x = x;
            this.cnt = cnt;
        }
    }
}