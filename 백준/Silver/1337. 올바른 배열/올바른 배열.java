import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            int count  = 0;
            for(int j = 1; j < 5; j++){
                if(!list.contains(list.get(i) + j) ){
                    count++;
                }
            }

            if(result > count){
                result = count;
            }
        }
        System.out.println(result);
    }
}