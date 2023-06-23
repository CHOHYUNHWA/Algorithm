import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        while(N-- > 0){
            int value = Integer.parseInt(br.readLine());
            if(value > count){
                for(int i = count + 1; i<= value; i++) {
                    stack.push(i);
                    sb.append("+").append('\n');
                }
                count = value;
            } else if(stack.peek() != value){
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append("-").append('\n');
        }
        System.out.println(sb);
    }
}