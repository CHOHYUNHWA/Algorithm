import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int tmp = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = i+1;
        }
        for(int i = 0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            tmp = arr[b];
            arr[b] = arr[a];
            arr[a] = tmp;
        }
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}