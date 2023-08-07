import java.io.*;
import java.util.*;

public class Main {
    static int N, K, count;
    static int[] visited = new int[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        bfs(N);
        System.out.println(count);
    }

    private static void bfs(int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(N);
        visited[N] = 1;
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            if(tmp == K){
                count = visited[tmp] - 1;
                return;
            }
            if(tmp - 1 >= 0 && visited[tmp -1] == 0){
                visited[tmp -1] = visited[tmp] +1;
                queue.offer(tmp -1);
            }
            if(tmp +1 <= 100000 && visited[tmp +1] == 0){
                visited[tmp + 1] = visited[tmp] + 1;
                queue.offer(tmp +1);
            }
            if(tmp * 2 <= 100000 && visited[tmp * 2] == 0){
                visited[tmp * 2] = visited[tmp] + 1;
                queue.offer(tmp * 2);
            }
        }
    }
}