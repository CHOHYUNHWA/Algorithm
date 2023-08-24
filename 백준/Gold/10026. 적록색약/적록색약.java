import java.io.*;
import java.util.*;

public class Main {
    static String[][] picture;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static Queue<int[]> queue = new LinkedList<>();
    static boolean[][] visited;
    static int N;
    static int generalCount = 0;
    static int colorWeaknessCount = 0;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        picture = new String[N][N];
        for(int i = 0; i < N; i++){
            String[] arr = br.readLine().split("");
            for(int j = 0; j < N; j++){
                picture[i][j] = arr[j];
            }
        }

        visited = new boolean[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                generalBfs(i, j);
            }
        }
        sb.append(generalCount).append(" ");
        visited = new boolean[N][N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(picture[i][j].equals("G")){
                    picture[i][j] = "R";
                }
                colorWeaknessBfs(i, j);
            }
        }
        sb.append(colorWeaknessCount);
        System.out.println(sb);
    }

    private static void generalBfs(int x, int y) {
        if(visited[x][y]){
            return;
        }
        visited[x][y] = true;
        queue.add(new int[]{x,y});
        while (!queue.isEmpty()){
            int[] point = queue.poll();
            for(int i = 0; i < 4; i++){
                int cx = point[0] + dx[i];
                int cy = point[1] + dy[i];
                if(cx < 0 || cy < 0 || cx >= N || cy >= N){
                    continue;
                }
                if(picture[cx][cy].equals(picture[point[0]][point[1]]) && !visited[cx][cy]){
                    queue.add(new int[]{cx,cy});
                    visited[cx][cy] = true;
                }

            }
        }
        generalCount++;
    }

    private static void colorWeaknessBfs(int x, int y) {
        if(visited[x][y]){
            return;
        }
        visited[x][y] = true;
        queue.add(new int[]{x,y});
        while (!queue.isEmpty()){
            int[] point = queue.poll();
            for(int i = 0; i < 4; i++){
                int cx = point[0] + dx[i];
                int cy = point[1] + dy[i];

                if(cx < 0 || cy < 0 || cx >= N || cy >= N){
                    continue;
                }
                if(picture[cx][cy].equals("G")){
                    picture[cx][cy] = "R";
                }
                if(picture[cx][cy].equals(picture[point[0]][point[1]]) && !visited[cx][cy]){
                    queue.add(new int[]{cx,cy});
                    visited[cx][cy] = true;
                }
            }
        }
        colorWeaknessCount++;
    }
}