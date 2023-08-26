import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int result = Integer.MAX_VALUE;
            int count = 0;
            int N = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            if(N >= 33){
                sb.append(0).append('\n');
                continue;
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    for (int k = j + 1; k < arr.length; k++) {
                        count = 0;
                        for(int l = 0; l < arr[i].length(); l++){
                            count += distance(arr[i].charAt(l),arr[j].charAt(l));
                            count += distance(arr[j].charAt(l),arr[k].charAt(l));
                            count += distance(arr[k].charAt(l),arr[i].charAt(l));
                        }
                        if(count < result){
                            result = count;
                        }
                    }
                }
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }

    static int distance(char a, char b){
        if(a != b){
            return 1;
        } else {
            return 0;
        }
    }
}