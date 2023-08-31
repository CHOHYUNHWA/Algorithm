import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N  = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        while(N-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            int num = 0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }
            if(command == 1){
                deque.addFirst(num);
                continue;
            }
            if(command == 2){
                deque.addLast(num);
                continue;
            }
            if(command == 3){
                if(deque.isEmpty()){
                    sb.append(-1).append('\n');
                    continue;
                } else {
                    sb.append(deque.pollFirst()).append('\n');
                    continue;
                }
            }
            if(command == 4){
                if(deque.isEmpty()){
                    sb.append(-1).append('\n');
                    continue;
                } else {
                    sb.append(deque.pollLast()).append('\n');
                    continue;
                }
            }
            if(command == 5){
                sb.append(deque.size()).append('\n');
                continue;
            }
            if(command == 6){
                if(deque.isEmpty()){
                    sb.append(1).append('\n');
                    continue;
                } else {
                    sb.append(0).append('\n');
                    continue;
                }
            }
            if(command == 7){
                if(deque.isEmpty()){
                    sb.append(-1).append('\n');
                    continue;
                } else {
                    sb.append(deque.getFirst()).append('\n');
                    continue;
                }
            }
            if(command == 8){
                if(deque.isEmpty()){
                    sb.append(-1).append('\n');
                    continue;
                } else {
                    sb.append(deque.getLast()).append('\n');
                    continue;
                }
            }
        }
        System.out.println(sb);
    }
}