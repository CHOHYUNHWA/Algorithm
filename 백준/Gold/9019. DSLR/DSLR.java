import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            Queue<Integer> queue = new LinkedList<>();
            boolean[] visited = new boolean[10000];
            String[] command = new String[10000];

            queue.add(a);
            visited[a] = true;
            Arrays.fill(command,"");

            while(!queue.isEmpty() && !visited[b]){
                int now = queue.poll();

                int D = (2 * now) % 10000;
                int S = now == 0 ? 9999 : now -1;
                int L = (now % 1000) * 10 + now/1000;
                int R = (now % 10) * 1000 + now /10;

                if(!visited[D]){
                    queue.add(D);
                    visited[D] = true;
                    command[D] = command[now] + "D";
                }

                if(!visited[S]){
                    queue.add(S);
                    visited[S] = true;
                    command[S] = command[now] + "S";
                }

                if(!visited[L]){
                    queue.add(L);
                    visited[L] = true;
                    command[L] = command[now] + "L";
                }

                if(!visited[R]){
                    queue.add(R);
                    visited[R] = true;
                    command[R] = command[now] + "R";
                }

            }
            sb.append(command[b]).append('\n');
        }
        System.out.println(sb);
    }
}