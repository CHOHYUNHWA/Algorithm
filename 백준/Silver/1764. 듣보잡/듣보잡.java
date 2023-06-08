import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = N+Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<String>();
        for(int i = 0; i< N; i++){
            String key = br.readLine();
            set.add(key);
        }
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i<N; i++ ){
            String key = br.readLine();
            if(set.contains(key)){
                arr.add(key);
            }
        }
        Collections.sort(arr);
        sb.append(arr.size()).append('\n');
        for(String a : arr){
            sb.append(a).append('\n');
        }
        System.out.println(sb);
    }
}