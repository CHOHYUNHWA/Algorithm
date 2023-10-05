import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
        for(int i = 0 ; i <= N; i++){
            tree.add(new ArrayList<Integer>());
        }

        for(int i = 0 ; i < N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        boolean[] visited = new boolean[N+1];
        int[] parent = new int[N+1];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        while (!queue.isEmpty()){
            int v = queue.remove();
            for(int node : tree.get(v)){
                if(!visited[node]){
                    visited[node] = true;
                    queue.add(node);
                    parent[node] = v;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i <= N; i++){
            sb.append(parent[i]).append('\n');
        }
        System.out.println(sb);
    }
}