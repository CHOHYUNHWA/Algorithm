import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int trim = (int)Math.round(arr.length*0.15);
        for(int i = trim; i < arr.length-trim; i++){
            sum += arr[i];
        }
        int answer = (int) Math.round((double) sum/(arr.length-(2*trim)));
        System.out.println(answer);
    }
}