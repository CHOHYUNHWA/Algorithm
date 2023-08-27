import java.io.*;
import java.util.*;

public class Main {
    static int[] board = new int[101];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 1; i < board.length; i++){
            board[i] = i;
        }
        while(N-- > 0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }
        while(M-- > 0){
            st= new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            board[x] = y;
        }
        int result = bfs(1);
        System.out.println(result);
    }

    private static int bfs(int start) {
        int[] check = new int[101];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while(true){
            int visitedNum = queue.poll();
            for(int i = 1; i <= 6; i++){
                int nextNode = visitedNum + i;

                if(nextNode > 100){
                    break;
                }
                if(check[board[nextNode]] == 0){
                    queue.offer(board[nextNode]);
                    check[board[nextNode]] = check[visitedNum] + 1;
                }
                if(board[nextNode] == 100){
                    return check[100];
                }
            }
        }
    }
}