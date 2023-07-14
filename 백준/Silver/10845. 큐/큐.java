import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedList<String> queue = new LinkedList<>();
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(str.startsWith("push")){
                push(queue,str);
            } else if(str.startsWith("pop")){
                sb.append(pop(queue)).append('\n');
            } else if(str.startsWith("size")){
                sb.append(size(queue)).append('\n');
            } else if(str.startsWith("empty")){
                sb.append(empty(queue)).append('\n');
            } else if(str.startsWith("front")){
                sb.append(front(queue)).append('\n');
            } else if(str.startsWith("back")){
                sb.append(back(queue)).append('\n');
            }
        }
        System.out.println(sb);
    }
    static void push(LinkedList<String> queue,String str){
        queue.offer(str.substring(5));
    }

    static String pop(LinkedList<String> queue) {
        if (queue.size() == 0) {
            return "-1";
        } else {
            return queue.pop();
        }
    }
    static String size(LinkedList<String> queue) {
        return String.valueOf(queue.size());
    }

    static String empty(LinkedList<String> queue) {
        if(queue.size() == 0) {
            return "1";
        } else {
            return "0";
        }
    }

    static String front(LinkedList<String> queue) {
        if(queue.size() == 0) {
            return "-1";
        } else{
            return queue.get(0);
        }
    }
    static String back(LinkedList<String> queue) {
        if(queue.size() == 0) {
            return "-1";
        } else{
            return queue.get(queue.size()-1);
        }
    }
}