import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        sb.append("<");
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> answerQueue = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }
        while(queue.size() != 0){
            for(int i = 0; i < K-1; i++){
                int tmp = queue.poll();
                queue.offer(tmp);
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.setLength(sb.length()-2);
        sb.append(">");
        System.out.println(sb);
    }
}