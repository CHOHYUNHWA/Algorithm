import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< a; i++){
            arr[i] = sc.nextInt();
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(min + " " +max);
    }
}