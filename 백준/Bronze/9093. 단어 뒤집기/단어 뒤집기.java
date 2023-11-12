import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            for (int k = 0; k < arr.length; k++) {
                for (int j = 0; j < arr[k].length(); j++) {
                    stack.push(arr[k].charAt(j));
                }
                for (int j = 0; j < arr[k].length(); j++) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}