import java.io.*;
import java.util.*;

public class Main {
    static int count;
    static int N, M;
    static String[][] campus;
    static boolean[][] visited;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {1, -1, 0, 0};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new String[N][M];
        visited = new boolean[N][M];
        int doyeonX = 0;
        int doyeonY = 0;

        for(int i = 0; i < N; i++){
            String[] arr = (br.readLine()).split("");
            for(int j = 0; j < M; j++){
                campus[i][j] = arr[j];
                if(campus[i][j].equals("I")) {
                    doyeonX = i;
                    doyeonY = j;
                }
            }
        }
        bfs(doyeonX,doyeonY);
        if(count == 0){
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
    }

    private static void bfs(int x, int y) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        while(!queue.isEmpty()){
            int[] spot = queue.poll();
            for(int i =0; i<4; i++){
                int cx = spot[0] + dx[i];
                int cy = spot[1] + dy[i];
                if(cx < 0 || cy < 0 || cx >=N || cy >= M){
                    continue;
                }
                if(visited[cx][cy] || campus[cx][cy].equals("X")){
                    continue;
                }
                if(campus[cx][cy].equals("O")){
                    visited[cx][cy] = true;
                    queue.add(new int[]{cx,cy});
                }
                if(campus[cx][cy].equals("P")){
                    visited[cx][cy] = true;
                    count++;
                    queue.add(new int[]{cx,cy});
                }
            }
        }
    }
}