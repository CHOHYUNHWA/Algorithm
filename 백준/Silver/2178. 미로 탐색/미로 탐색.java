import java.io.*;
import java.util.*;

public class Main {
    static int[][] miro;
    static boolean[][] visited;
    static int N,M;
    static int count;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        miro = new int[N][M];
        visited = new boolean[N][M];

        for(int i = 0; i < N; i++){
            String[] element = (br.readLine()).split("");
            for(int j = 0; j < M; j++){
                miro[i][j] = Integer.parseInt(element[j]);
            }
        }
        visited[0][0] = true;
        bfs(0,0);
        System.out.println(miro[N-1][M-1]);
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});

        while (!queue.isEmpty()){
            int[] spot = queue.poll();
            for(int i = 0; i < 4; i++) {
                int cx = spot[0] + dx[i];
                int cy = spot[1] + dy[i];
                if(cx < 0 || cy < 0 || cx >= N || cy >= M){
                    continue;
                }
                if(visited[cx][cy] || miro[cx][cy] ==0){
                    continue;
                }
                queue.add(new int[]{cx,cy});
                miro[cx][cy] = miro[spot[0]][spot[1]] + 1;
                visited[cx][cy] = true;
            }
        }
    }
}