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
            if(match(str)){
                sb.append("yes").append('\n');
            } else{
                sb.append("no").append('\n');
            }
        }
        System.out.println(sb);
    }
    static boolean match(String str){
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '[' || str.charAt(i) == '('){
                stack.push(str.charAt(i));
            } else if (str.charAt(i) == ']'){
                if(stack.empty()){
                    return false;
                }
                if(stack.peek() != '['){
                    return false;
                } else if(stack.peek() == '['){
                    stack.pop();
                }
            }

            else if (str.charAt(i) == ')'){
                if(stack.empty()){
                    return false;
                }
                if(stack.peek() != '('){
                    return false;
                } else if(stack.peek() == '('){
                    if(stack.empty()){
                        return false;
                    }
                    stack.pop();
                }
            }
        }
        if(!stack.empty()){
            return false;
        } else {
            return true;
        }
    }
}