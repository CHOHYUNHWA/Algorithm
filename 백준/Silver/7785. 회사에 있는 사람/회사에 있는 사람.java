import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<String,String> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            map.put(key, value);
            if(map.get(key).equals("leave")){
                map.remove(key);
            }
        }
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        Collections.sort(list,Collections.reverseOrder());
        for(int i = 0; i < list.size(); i++){
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}