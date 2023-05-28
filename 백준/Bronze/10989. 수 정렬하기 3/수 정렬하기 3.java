import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10000001];
        for(int i = 0; i<N; i++){
            int tmp = Integer.parseInt(br.readLine());
            arr[tmp]++;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0) {
                for (int j = 0; j < arr[i]; j++) {
                    sb.append(i).append('\n');
                }
            }
        }
        System.out.println(sb);
    }
}