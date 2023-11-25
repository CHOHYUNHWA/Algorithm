import java.io.*;
import java.util.*;

public class Main {
    static int N,K;
    static int[] check = new int[100_001];
    static int[] before = new int[100_001];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        int result = bfs(N);

        Stack<Integer> stack = new Stack<>();
        int index = K;
        while(index != N) {
            stack.push(index);
            index = before[index];
        }
        stack.push(N);

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }
        System.out.println(result);
        System.out.println(sb);
    }

    static int bfs(int N){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);

        while(!queue.isEmpty()){
            int x = queue.poll();
            if(x == K){
                return check[x];
            }
            if(x > 0 && check[x -1] == 0){
                queue.add(x-1);
                check[x-1] = check[x] + 1;
                before[x - 1] = x;
            }
            if(x +1 < check.length && check[x+1] == 0){
                queue.add(x+1);
                check[x+1] = check[x] + 1;
                before[x + 1] = x;
            }
            if(x *2 < check.length && check[x*2] == 0){
                queue.add(x*2);
                check[x*2] = check[x] + 1;
                before[x *2] = x;
            }
        }
        return 0;
    }
}