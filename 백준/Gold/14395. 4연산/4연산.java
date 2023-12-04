import java.io.*;
import java.util.*;

public class Main {
    static long s,t;
    static String[] order = new String[] {"*", "+", "-", "/"};
    static Set<Long> set = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        s = Long.parseLong(st.nextToken());
        t = Long.parseLong(st.nextToken());
        bfs();
    }

    private static void bfs() {

        if(s == t){
            System.out.println(0);
            return;
        }

        Queue<Num> queue = new LinkedList<>();
        queue.offer(new Num(s,""));

        while(!queue.isEmpty()) {
            Num now = queue.poll();

            if (now.num == t) {
                System.out.println(now.history);
                return;
            }

            long nextNum = 0;

            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0:
                        nextNum = now.num * now.num;
                        break;
                    case 1:
                        nextNum = now.num + now.num;
                        break;
                    case 2:
                        nextNum = now.num - now.num;
                        break;
                    case 3:
                        if (now.num != 0) {
                            nextNum = 1L;
                        }
                        break;
                }
                if (!set.contains(nextNum)) {
                    set.add(nextNum);
                    queue.offer(new Num(nextNum, now.history + order[i]));
                }
            }
        }
        System.out.println(-1);
    }

    static class Num{
        long num;
        String history = "";

        public Num(long num, String history) {
            this.num = num;
            this.history = history;
        }
    }
}