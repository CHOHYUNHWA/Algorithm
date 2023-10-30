import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        StringBuilder sb = new StringBuilder();
        String result = "";
        Arrays.sort(arr);
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            if(map.get(arr[i]) == null){
                map.put(arr[i], 1);
            } else if(map.get(arr[i]) != null){
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        int count = 0;
        for (Integer value : map.values()) {
            if(value %2 == 1){
                count++;
            }
        }
        if(count >= 2){
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        if(arr.length % 2 == 0 && count >=1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }
        if (arr.length % 2 == 0) {
            for (Integer value : map.values()) {
                if(value % 2 != 0){
                    System.out.println("I'm Sorry Hansoo");
                    return;
                }
            }
            List<String> strings = new ArrayList<>(map.keySet());
            Collections.sort(strings);
            for (String string : strings) {
                int size = map.get(string);
                for(int i = 0 ; i < size/2; i++){
                    sb.append(string);
                }
            }
            String front = sb.toString();
            String back = sb.reverse().toString();
            System.out.println(front + back);
            return;

        } else {
            List<String> strings = new ArrayList<>(map.keySet());
            Collections.sort(strings);
            String tmp = "";
            for (String string : strings) {
                if(map.get(string)%2 != 0){
                    tmp = string;
                    map.put(string, map.get(string) - 1);
                }
            }

            for (String string : strings) {
                int size = map.get(string);
                for(int i = 0 ; i < size/2; i++){
                    sb.append(string);
                }
            }
            String front = sb.toString() + tmp;
            String back = sb.reverse().toString();
            System.out.println(front + back);
            return;
        }
    }
}