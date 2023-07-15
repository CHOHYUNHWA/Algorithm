import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(st.nextToken());
            }
            if(arr[0] == 0){
                break;
            }
            Arrays.sort(arr);
            if(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2)){
                sb.append("right").append('\n');
            } else {
                sb.append("wrong").append('\n');
            }
        }
        System.out.println(sb);
    }
}