import java.util.*;
import java.io.*;


public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String arr = br.readLine();
            String[] strArr = arr.substring(1,arr.length()-1).split(",");

            AC(p,strArr);

        }
        System.out.println(sb);
    }


    static void AC(String p, String[] strArr) {

        boolean reverse = false;
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        if(!strArr[0].equals("")){
            for(int i = 0; i < strArr.length; i++){
                deque.add(Integer.parseInt(strArr[i]));
            }
        }
        for(int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == 'R') {
                if (!reverse) {
                    reverse = true;
                } else {
                    reverse = false;
                }
            }
            if (p.charAt(i) == 'D') {
                if(deque.size() == 0){
                    sb.append("error").append('\n');
                    return;
                }
                else if (!reverse) {
                    deque.removeFirst();
                } else {
                    deque.removeLast();
                }
            }
        }
        
        printAnswer(deque,reverse);
        
    }

    static void printAnswer(ArrayDeque deque, boolean reverse){
        sb.append("[");
        if(deque.size() != 0) {
            int size = deque.size();
            if(!reverse){
                for(int i = 0; i < size-1; i++){
                    sb.append(deque.pollFirst()).append(",");
                }
                sb.append(deque.pollFirst());
            } else {
                for(int i = size-1; i > 0; i--){
                    sb.append(deque.pollLast()).append(",");
                }
                sb.append(deque.pollLast());
            }
        }
        sb.append("]").append('\n');
    }
}