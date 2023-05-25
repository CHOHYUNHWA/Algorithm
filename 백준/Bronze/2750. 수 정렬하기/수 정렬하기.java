import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i< N ; i++){
            int tmp = Integer.parseInt(br.readLine());
            arr[i] = tmp;
        }
        Arrays.sort(arr);
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}