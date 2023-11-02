import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i < N; i++){
            String input = br.readLine();
            if(map.get(input)==null ){
                map.put(input,1);
            } else {
                map.put(input, map.get(input) +1);
            }
        }

        int max = 0;
        int compareInt = 0;
        String result = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max){
                max = entry.getValue();
                result = entry.getKey();
            }
            if(entry.getValue() == max){
                compareInt = result.compareTo(entry.getKey());
                if(compareInt > 0){
                    result = entry.getKey();
                }
            }
        }
        System.out.println(result);
    }
}