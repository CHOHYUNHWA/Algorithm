import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedList<Integer> deque = new LinkedList<>();
        while(N-- > 0){
            solve(deque,sb,br);
        }
        System.out.println(sb);
    }

    static void solve(LinkedList<Integer> deque, StringBuilder sb,BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        if(str.substring(0,4).equals("push")){
            if(str.contains("front")){
                deque.add(0 ,Integer.parseInt(st.nextToken()));
                return;
            } else {
                deque.add(Integer.parseInt(st.nextToken()));
                return;
            }
        }
        if(str.substring(0,3).equals("pop")){
            if(str.contains("front")){
                if(deque.size() == 0){
                    sb.append(-1).append('\n');
                    return;
                } else {
                    sb.append(deque.remove(0)).append('\n');
                    return;
                }
            }
            if(str.contains("back")){
                if(deque.size() == 0){
                    sb.append(-1).append('\n');
                    return;
                } else {
                    sb.append(deque.remove(deque.size()-1)).append('\n');
                    return;
                }
            }
        }
        if(str.equals("size")){
            sb.append(deque.size()).append('\n');
            return;
        }
        if(str.equals("empty")){
            if(deque.size()==0){
                sb.append(1).append('\n');
                return;
            } else{
                sb.append(0).append('\n');
                return;
            }
        }
        if(str.equals("front")) {
            if (deque.size() == 0) {
                sb.append(-1).append('\n');
                return;
            } else {
                sb.append(deque.get(0)).append('\n');
                return;
            }
        }
        if(str.equals("back")) {
            if (deque.size() == 0) {
                sb.append(-1).append('\n');
                return;
            } else {
                sb.append(deque.get(deque.size()-1)).append('\n');
                return;
            }
        }
    }
}