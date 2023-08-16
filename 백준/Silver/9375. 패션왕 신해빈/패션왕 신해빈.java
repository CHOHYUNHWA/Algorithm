import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0){
            int n = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            while (n-- > 0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String kind = st.nextToken();
                if (map.containsKey(kind)) {
                    map.put(kind, map.get(kind) + 1);
                } else {
                    map.put(kind, 1);
                }
            }
            int result = 1;
            for (Integer value : map.values()) {
                result *= (value + 1);
            }
            sb.append(result-1).append('\n');
        }
        System.out.println(sb);
    }
}