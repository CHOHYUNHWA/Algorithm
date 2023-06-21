import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < N ; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int answer = stack.stream().mapToInt(Integer::intValue).sum();
        System.out.println(answer);
    }
}