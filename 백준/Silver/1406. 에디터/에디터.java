import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<String> leftStr = new Stack<>();
        Stack<String> rightStr = new Stack<>();

        String[] arr = br.readLine().split("");
        int N = Integer.parseInt(br.readLine());
        for (String s : arr) {
            leftStr.push(s);
        }

        for(int i = 0 ; i < N; i++){
            String command = br.readLine();
            if(command.charAt(0) == 'L'){
                if(!leftStr.isEmpty()){
                    rightStr.push(leftStr.pop());
                }
            }
            if(command.charAt(0) == 'D'){
                if(!rightStr.isEmpty()){
                    leftStr.push(rightStr.pop());
                }
            }
            if(command.charAt(0) == 'B'){
                if(!leftStr.isEmpty()) {
                    leftStr.pop();
                }
            }
            if(command.charAt(0) == 'P'){
                leftStr.push(String.valueOf(command.charAt(2)));
            }
        }
        while(!leftStr.isEmpty()){
            rightStr.push(leftStr.pop());
        }
        while(!rightStr.isEmpty()){
            sb.append(rightStr.pop());
        }
        System.out.println(sb);
    }
}