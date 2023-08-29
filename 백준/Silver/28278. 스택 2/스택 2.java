import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        while(N-- > 0){
            int num = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }
            if(command == 1){
                stack.push(num);
            }
            if(command == 2){
                if(!stack.empty()) {
                    Integer pop = stack.pop();
                    sb.append(pop).append('\n');
                } else{
                    sb.append(-1).append('\n');
                }
            }
            if(command == 3){
                sb.append(stack.size()).append('\n');
            }
            if(command == 4){
                if(stack.empty()){
                    sb.append(1).append('\n');
                } else{
                    sb.append(0).append('\n');
                }
            }
            if(command == 5){
                if(stack.empty()){
                    sb.append(-1).append('\n');
                } else{
                    sb.append(stack.peek()).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}
