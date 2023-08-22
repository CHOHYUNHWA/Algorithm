import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static Map<Integer,Integer> map;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> treeMap = new TreeMap<>();
            while (k-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String operator = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if(operator.equals("I")){
                    treeMap.put(num, treeMap.getOrDefault(num,0) + 1);
                } else {
                    if(treeMap.isEmpty()){
                        continue;
                    } else if(num == 1){
                        int maxKey = treeMap.lastKey();
                        if(treeMap.get(maxKey) == 1){
                            treeMap.remove(maxKey);
                        } else {
                            treeMap.put(maxKey, treeMap.get(maxKey) - 1);
                        }
                    } else if(num == -1) {
                        int minKey = treeMap.firstKey();
                        if (treeMap.get(minKey) == 1) {
                            treeMap.remove(minKey);
                        } else {
                            treeMap.put(minKey, treeMap.get(minKey) - 1);
                        }
                    }
                }
            }
            if(treeMap.isEmpty()){
                sb.append("EMPTY").append('\n');
            } else{
                sb.append(treeMap.lastKey()+ " " + treeMap.firstKey()).append('\n');
            }
        }
        System.out.println(sb);
    }
}