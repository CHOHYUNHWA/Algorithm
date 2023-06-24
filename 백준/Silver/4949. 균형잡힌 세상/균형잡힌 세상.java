import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }
                sb.append(match(str)).append('\n');
        }
        System.out.println(sb);
    }
    static String match(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0 ; i < str.length() ; i++){
            char c = str.charAt(i);
            if(c == '[' || c == '('){
                stack.push(c);
            } else if (c == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                } else if(stack.peek() == '['){
                    stack.pop();
                }
            }

            else if (c == ')'){
                if(stack.empty() || stack.peek() != '('){
                    return "no";
                } else if(stack.peek() == '('){
                    if(stack.empty()){
                        return "no";
                    }
                    stack.pop();
                }
            }
        }
        if(!stack.empty()){
            return "no";
        } else {
            return "yes";
        }
    }
}