import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = N+Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<String,Integer>();
        for(int i = 0; i< M; i++){
            String key = br.readLine();
            if(map.get(key) != null){
                map.merge(key,1,Integer::sum);
            } else {
                map.put(key, 1);
            }
        }
        int count = 0;
        ArrayList<String> arr = new ArrayList<>();
        for(String key : map.keySet()){
            if(map.get(key)==2){
                count++;
                arr.add(key);
            }
        }
        Collections.sort(arr);
        sb.append(count).append('\n');
        for(String a : arr){
            sb.append(a).append('\n');
        }
        System.out.println(sb);
    }
}