import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] strArr = new String[N+1];
        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            map.put(name, i);
            strArr[i] = name;
        }
        for (int i = 0; i < M; i++) {
            String tmp = br.readLine();
            if(!isCheckInt(tmp)){
                sb.append(map.get(tmp)).append('\n');
            } else {
                sb.append(strArr[Integer.parseInt(tmp)]).append('\n');
            }
        }
        System.out.println(sb);
    }
    static boolean isCheckInt(String s){
        try{
            Integer.parseInt(s);
        } catch (Exception e){
            return false;
        }
        return true;
    }
}