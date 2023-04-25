import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for(int i = 0; i < m; i++) {
            int start = sc.nextInt()-1;
            int end = sc.nextInt() -1;
            while (start < end) {
                int tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}