import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i<=n; i++){
            q.offer(i) ;
        }
        StringBuilder res = new StringBuilder();
        res.append("<");
        while(!q.isEmpty()){
            for(int i = 0; i<m-1; i++){
                q.offer(q.poll());
            }
            res.append(q.poll()).append(", ");
        }
        res.deleteCharAt(res.length() -1);
        res.deleteCharAt(res.length() -1);
        res.append(">");
        System.out.println(res);
    }
}