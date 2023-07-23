import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        while(N-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(x == 0 && !queue.isEmpty()){
                sb.append(queue.poll()).append('\n');
            } else if(x == 0 && queue.isEmpty()){
                sb.append(0).append('\n');
            }
            if(x != 0){
                queue.add(x);
            }
        }
        System.out.println(sb);
    }
}