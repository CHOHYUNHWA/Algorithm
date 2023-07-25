import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int abs1 = Math.abs(o1);
                int abs2 = Math.abs(o2);

                if (abs1 == abs2) {
                    return o1 > o2 ? 1 : -1;
                }
                return abs1 - abs2;
            }
        });

        while(N-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(!queue.isEmpty()){
                    sb.append(queue.poll()).append('\n');
                } else {
                    sb.append(0).append('\n');
                }
            } else {
                queue.add(x);
            }
        }
        System.out.println(sb);
    }
}