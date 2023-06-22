import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i< N; i++){
            String str = br.readLine();
            sb.append(VPS(str)).append('\n');
        }
        System.out.println(sb);
    }

    static String VPS(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(c == '('){
                stack.push(c);
            } else if( c == ')'){
                try {
                    stack.pop();
                } catch (Exception e){
                    return "NO";
                }
            }
        }
        if(stack.empty()){
            return "YES";
        } else {
            return "NO";
        }
    }
}