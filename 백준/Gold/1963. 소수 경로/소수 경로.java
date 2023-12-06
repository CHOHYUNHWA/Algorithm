import java.util.*;
import java.io.*;

public class Main{
    static int T;
    static int before,after;
    static boolean[] demical = new boolean[10000];
    static boolean[] visited;
    static int[] arr = {1000, 100, 10, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for(int i = 1000; i <= 9999; i++){
            demical[i] = isPrime(i);
        }

        for(int i = 0 ; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            before = Integer.parseInt(st.nextToken());
            after = Integer.parseInt(st.nextToken());

            result = bfs(before, after);
            if(result == -1){
                sb.append("Impossible").append('\n');
            } else {
                sb.append(result).append('\n');
            }
        }
        System.out.println(sb);
    }

    private static boolean isPrime(int n) {
        for(int i = 2; i <=(int) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    private static int bfs(int before, int after) {

        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.count - o2.count;
            }
        });
        visited = new boolean[10000];
        queue.offer(new Node(before, 0));
        visited[before] = true;

        while(!queue.isEmpty()){
            Node node = queue.poll();

            if(node.num == after){
                return node.count;
            }

            int[] pNum = {node.num/1000, (node.num/100)%10, (node.num/10)%10, node.num%10};
            for(int i = 0 ; i < 4; i++){
                    int val = node.num / arr[i] / 10;
                    int mod = node.num % arr[i];

                    for(int j = 0; j<= 9; j++){
                        if(i == 0 && j == 0){
                            continue;
                        }

                        int next = (val * arr[i] * 10) + (j * arr[i]) + mod;
                        if(next > 9999 || visited[next] || !demical[next]){
                            continue;
                        }
                        queue.offer(new Node(next, node.count +1));
                        visited[next] = true;
                    }
            }
        }
        return -1;
    }

    public static class Node{
        int num;
        int count;

        public Node(int num, int count) {
            this.num = num;
            this.count = count;
        }
    }
}