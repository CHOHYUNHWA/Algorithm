import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static ArrayList<Integer> list = new ArrayList();
    static int N, count;
    static int result = 0;
    static Queue<int[]> queue = new LinkedList<>();
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            String[] arr = (br.readLine()).split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    visited[i][j] = true;
                    bfs(i, j);
                }
            }
        }

        Collections.sort(list);
        sb.append(result).append('\n');

        for (Integer integer : list) {
            sb.append(integer).append('\n');
        }
        System.out.println(sb);

    }

    private static void bfs(int x, int y) {
        count =1;
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int cx = current[0] + dx[i];
                int cy = current[1] + dy[i];

                if (cx < 0 || cy < 0 || cx >= N || cy >= N) {
                    continue;
                }
                if(map[cx][cy] == 1 && !visited[cx][cy]) {
                    count++;
                    visited[cx][cy] = true;
                    queue.add(new int[]{cx, cy});
                }
            }
        }
        result++;
        list.add(count);
    }
}