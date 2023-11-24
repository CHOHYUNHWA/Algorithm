import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static boolean[][] visited;
    static int[] mx = {-2,-2,0,0,2,2};
    static int[] my = {-1,+1,-2,2,-1,1};
    static int result = -1;
    static int startX,startY,dx,dy;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        result = -1;
        visited = new boolean[N][N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        startX = Integer.parseInt(st.nextToken());
        startY = Integer.parseInt(st.nextToken());
        dx = Integer.parseInt(st.nextToken());
        dy = Integer.parseInt(st.nextToken());

        int result = bfs(startX, startY);
        System.out.println(result);

    }

    private static int bfs(int startX, int startY) {
        Queue<Point> queue = new LinkedList<>();
        queue.offer((new Point(startX,startY,0)));
        visited[startX][startY] = true;
        
        while(!queue.isEmpty()){
            
            Point point = queue.poll();

            if(point.x == dx && point.y == dy){
                return point.count;
            }
            
            for(int i = 0; i < 6; i++){
                int cx = point.x + mx[i];
                int cy = point.y + my[i];

                if(cx < 0 || cy < 0 || cx >= N || cy >= N){
                    continue;
                }
                if(visited[cx][cy]){
                    continue;
                }
                queue.offer(new Point(cx,cy,point.count + 1));
                visited[cx][cy] = true;
            }
        }
        return -1;
    }
    
    static class Point{
        int x;
        int y;
        int count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}