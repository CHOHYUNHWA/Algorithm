import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < M ; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (map.containsKey(tmp)) {
                int value = map.get(tmp).intValue();
                map.put(tmp, value + 1);
            } else {
                map.put(tmp, 1);
            }
        }
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            int tmp = Integer.parseInt(st.nextToken());
            if(map.get(tmp)==null){
                answer[i] =0;
            } else {
                answer[i] = map.get(tmp);
            }
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb);
    }
}