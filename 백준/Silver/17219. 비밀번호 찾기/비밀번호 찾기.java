import java.io.*;
import java.util.*;

public class Main {
    static Integer[][] dp = new Integer[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        while(N-- > 0){
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }
        while(M-- > 0){
            st = new StringTokenizer(br.readLine());
            String password = map.get(st.nextToken());
            sb.append(password).append('\n');
        }
        System.out.println(sb);
    }
}