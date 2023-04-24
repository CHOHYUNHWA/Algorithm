import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<m; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();
            int K = sc.nextInt();
            for(int j = I-1; j<J; j++){
                arr[j] = K;
            }
        }
        for(int k = 0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
