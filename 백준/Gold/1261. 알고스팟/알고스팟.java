import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[][] miro;
    static int[] dx = { -1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        miro = new int[M+1][N+1];

        for(int i = 1; i <= M; i++){
            st= new StringTokenizer(br.readLine());
            String[] strArr = st.nextToken().split("");
            for(int j = 1 ; j <= N; j++){
                miro[i][j] = Integer.parseInt(strArr[j-1]);
            }
        }

        int result = bfs(1,1);
        System.out.println(result);

    }

    static int bfs(int x, int y) {
        PriorityQueue<Point> q = new PriorityQueue<>();
        q.offer(new Point(x,y,0));
        boolean[][] visited = new boolean[M+1][N+1];
        visited[x][y] = true;

        while(!q.isEmpty()){
            Point point  = q.poll();
            if(point.x == M && point.y == N){
                return point.cnt;
            }
            for(int i = 0 ; i < 4; i++){
                int cx = point.x + dx[i];
                int cy = point.y + dy[i];

                if(cx < 1 || cy < 1 || cx > M || cy > N){
                    continue;
                }
                if(!visited[cx][cy] && miro[cx][cy] == 0){
                    visited[cx][cy] = true;
                    q.offer(new Point(cx,cy, point.cnt));
                }
                if(!visited[cx][cy] && miro[cx][cy] == 1){
                    visited[cx][cy] = true;
                    q.offer((new Point(cx,cy, point.cnt + 1)));
                }
            }
        }
        return 0;
    }

    static class Point implements Comparable<Point>{
        int x;
        int y;
        int cnt;

        public Point(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Point o) {
            return cnt - o.cnt;
        }
    }
}