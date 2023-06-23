import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();
        int count = 1;
        for(int i = 0; i< N; i++) {
            int element = Integer.parseInt(br.readLine());
            for (int j = 0; j <= element; j++) {
                    if (!stack.empty() && element == stack.peek()) {
                    stack.pop();
                    sb.append("-").append('\n');
                    break;
                } else if(stack.empty() || stack.peek() <= element) {
                        stack.push(count++);
                        sb.append("+").append('\n');
                    } else {
                        break;
                    }
            }
        }
        if(!stack.isEmpty()){
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}