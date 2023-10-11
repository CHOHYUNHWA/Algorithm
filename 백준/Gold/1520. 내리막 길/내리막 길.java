import java.io.*;
import java.util.*;


public class Main {
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int M, N;
    static int[][] map, dp;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[M][N];
        dp = new int[M][N];
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                dp[i][j] = -1;
            }
        }

        System.out.println(dfs(0, 0));
    }

    static int dfs(int x, int y) {
        if (x == M - 1 && y == N - 1) {
            return 1;
        }
        if (dp[x][y] != -1) {
            return dp[x][y];
        }
        dp[x][y] = 0;
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];

            if (cx < 0 || cy < 0 || cx >= M || cy >= N) {
                continue;
            }

            if (map[x][y] > map[cx][cy]) {
                dp[x][y] += dfs(cx, cy);
            }
        }
        return dp[x][y];
    }
}
