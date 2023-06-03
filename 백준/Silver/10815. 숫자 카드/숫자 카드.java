import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            map.put(Integer.parseInt(st.nextToken()),1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(map.get(tmp) == null){
                sb.append(0).append(" ");
            } else {
                sb.append(map.get(tmp)).append(" ");
            }
        }
        System.out.println(sb);
    }
}