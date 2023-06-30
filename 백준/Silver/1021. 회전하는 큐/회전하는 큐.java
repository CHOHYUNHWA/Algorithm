import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> queue = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            queue.offer(i);
        }

        int count = 0;

        st = new StringTokenizer(br.readLine());
        while(M-- > 0){
            int tmp = Integer.parseInt(st.nextToken());
            int idx = queue.indexOf(tmp);
            if(idx <= queue.size() - idx){
                if(queue.get(0) == tmp){
                    queue.poll();
                } else {
                    for (int i = 0; i < idx; i++) {
                        queue.offer(queue.poll());
                        count++;
                    }
                    queue.poll();
                }
            } else {
//                if (queue.get(0) == tmp) {
//                    queue.poll();
//                } else {
                    for (int i = 0; i < queue.size() - idx; i++) {
                        queue.add(0, queue.get(queue.size()-1));
                        queue.remove(queue.size() - 1);
                        count++;
                    }
                    queue.poll();
//                }
            }
        }
        System.out.println(count);
    }
}