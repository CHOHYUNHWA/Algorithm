import java.util.*;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < N; i++) {
            st= new StringTokenizer(br.readLine());
            String key = st.nextToken();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else if (key.length() >= M) {
                map.put(key, 1);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                Integer o1Length = o1.getKey().length();
                Integer o2Length = o2.getKey().length();
                if(o1.getValue().equals(o2.getValue())){
                    if(o1Length.equals(o2Length)){
                        return o1.getKey().compareTo(o2.getKey());
                    }
                    return o2Length.compareTo(o1Length);
                }
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for(int i = 0; i<list.size(); i++){
            sb.append(list.get(i).getKey()).append('\n');
        }
        System.out.println(sb);
    }
}