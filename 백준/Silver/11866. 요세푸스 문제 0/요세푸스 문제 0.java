import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        sb.append("<");
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= N; i++){
            list.add(i);
        }
        int idx = 0;
        while(list.size() > 0){
            idx = (idx + (K - 1)) % list.size();
            sb.append(list.remove(idx)).append(", ");
        }
        sb.setLength(sb.length()-2);
        sb.append(">");
        System.out.println(sb);
    }
}